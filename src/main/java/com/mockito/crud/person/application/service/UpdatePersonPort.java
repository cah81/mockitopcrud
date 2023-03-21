package com.mockito.crud.person.application.service;

import com.mockito.crud.person.domain.Person;

public interface UpdatePersonPort {
    public Person updatePerson(Integer id, Person person);
}
