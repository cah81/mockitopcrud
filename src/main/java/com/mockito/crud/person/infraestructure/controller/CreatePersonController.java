package com.mockito.crud.person.infraestructure.controller;

import com.mockito.crud.person.application.service.CreateUserPort;
import com.mockito.crud.person.application.service.FindByIdPort;
import com.mockito.crud.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class CreatePersonController {
    @Autowired
    CreateUserPort createUserPort;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Person> createNewUser(@RequestBody Person person) {
        Person createdPerson = createUserPort.createNewUser(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPerson);
    }
}


