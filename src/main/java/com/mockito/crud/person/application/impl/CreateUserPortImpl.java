package com.mockito.crud.person.application.impl;

import com.mockito.crud.person.application.service.CreateUserPort;
import com.mockito.crud.person.domain.Person;
import com.mockito.crud.person.infraestructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserPortImpl implements CreateUserPort {

    @Autowired
    PersonRepository personRepository;
    @Override
    public Person createNewUser(Person person) {
        return personRepository.save(person);
    }




}
