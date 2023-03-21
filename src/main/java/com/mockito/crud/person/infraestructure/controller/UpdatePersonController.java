package com.mockito.crud.person.infraestructure.controller;

import com.mockito.crud.person.application.service.UpdatePersonPort;
import com.mockito.crud.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{id}")
public class UpdatePersonController {
    @Autowired
    UpdatePersonPort service;

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Person> updateUser(@PathVariable Integer id, @RequestBody Person person){
        return ResponseEntity.ok().body(service.updatePerson(id,person));

    }

}
