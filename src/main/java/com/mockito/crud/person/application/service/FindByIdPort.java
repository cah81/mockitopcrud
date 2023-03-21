package com.mockito.crud.person.application.service;

import com.mockito.crud.person.domain.Person;

import java.util.Optional;

public interface FindByIdPort {

    public Optional<Person> findById(Integer id);
}
