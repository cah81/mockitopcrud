package com.mockito.crud.person.application.impl;

import com.mockito.crud.person.application.service.UserListPort;
import com.mockito.crud.person.domain.Person;
import com.mockito.crud.person.infraestructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserListPortImpl implements UserListPort {
    @Autowired
    PersonRepository service;

    @Override
    public List<Person> personList() {
        return  service.findAll();
    }
}
