package com.mockito.crud.person.application.service;

import com.mockito.crud.person.domain.Person;

import java.util.List;

public interface FindByNamePort {
    public List<Person> findByName(String name);
}
