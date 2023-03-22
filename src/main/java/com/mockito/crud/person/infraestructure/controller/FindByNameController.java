package com.mockito.crud.person.infraestructure.controller;

import com.mockito.crud.person.application.service.FindByNamePort;
import com.mockito.crud.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class FindByNameController {
    @Autowired
    FindByNamePort service;
    @GetMapping("/list/{name}")
    public List<Person> findByName(@PathVariable String name){
        return service.findByName(name);
    }
}
