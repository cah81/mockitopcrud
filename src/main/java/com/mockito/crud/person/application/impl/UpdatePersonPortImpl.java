package com.mockito.crud.person.application.impl;

import com.mockito.crud.exception.EntityNotFoundException;
import com.mockito.crud.person.application.service.UpdatePersonPort;
import com.mockito.crud.person.domain.Person;
import com.mockito.crud.person.infraestructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UpdatePersonPortImpl implements UpdatePersonPort {
    @Autowired
    PersonRepository dao;


    @Override
    public Person updatePerson(Integer id, Person person) {
        Person personUdpate;
        Optional<Person> personOptional = dao.findById(id);
        if(personOptional.isEmpty()){
            throw new EntityNotFoundException("Person does not exist",404,new Date());
        }
        personUdpate = personOptional.get();
        personUdpate.setName(person.getName());
        personUdpate.setEmail(person.getEmail());

         return dao.save(personUdpate);
    }
}
