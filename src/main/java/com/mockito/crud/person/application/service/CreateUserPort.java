package com.mockito.crud.person.application.service;

import com.mockito.crud.person.domain.Person;

public interface CreateUserPort {
    public Person createNewUser(Person person);

}
