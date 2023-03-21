package com.mockito.crud.person.application.service;

import com.mockito.crud.person.domain.Person;

import java.util.List;

public interface UserListPort {

    public List<Person> personList();
}
