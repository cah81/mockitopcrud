package com.mockito.crud.person.application.impl;

import com.mockito.crud.exception.EntityNotFoundException;
import com.mockito.crud.person.application.service.DeletePersonPort;
import com.mockito.crud.person.domain.Person;
import com.mockito.crud.person.infraestructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
@Service
public class DeletePersonPortImpl implements DeletePersonPort {
    @Autowired
    PersonRepository personRepository;
    @Override
    public String deletePerson(Integer id) {
        Optional<Person> personOptional = personRepository.findById(id);
        if(personOptional.isEmpty()){
            throw  new EntityNotFoundException("Person does not exist",404,new Date());
        }
        else{
            personRepository.deleteById(id);
        }
        return "Person delete";
    }
}
