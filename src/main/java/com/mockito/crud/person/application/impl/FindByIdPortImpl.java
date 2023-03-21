package com.mockito.crud.person.application.impl;

import com.mockito.crud.exception.EntityNotFoundException;
import com.mockito.crud.person.application.service.FindByIdPort;
import com.mockito.crud.person.domain.Person;
import com.mockito.crud.person.infraestructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
@Service
public class FindByIdPortImpl implements FindByIdPort {
    @Autowired
    PersonRepository personDaoRepository;
    @Override
    public Optional<Person> findById(Integer id) {

        Optional<Person> person = personDaoRepository.findById(id);
        if(person.isEmpty()){
            throw new EntityNotFoundException("Person with id: " + id + "does not exist",404,new Date());
        }
        else{
            return personDaoRepository.findById(id);
        }


    }
}
