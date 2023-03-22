package com.mockito.crud.person.application.impl;

import com.mockito.crud.person.application.service.FindByNamePort;
import com.mockito.crud.person.domain.Person;
import com.mockito.crud.person.infraestructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FindByNameImpl implements FindByNamePort {
    @Autowired
    PersonRepository personRepository;
    @Override
    public List<Person> findByName(String name) {
       List<Person> listPerson = new ArrayList<>();
        listPerson = personRepository.findByName(name);
        return listPerson;
    }
}
