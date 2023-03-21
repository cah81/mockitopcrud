package com.mockito.crud.person.infraestructure.controller;

import com.mockito.crud.person.application.service.FindByIdPort;
import com.mockito.crud.person.application.service.UserListPort;
import com.mockito.crud.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class ListPersonController {


    @Autowired
    UserListPort service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Person>> personList(){
        return ResponseEntity.ok().body(service.personList());
    }
}
