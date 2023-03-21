package com.mockito.crud.person.infraestructure.controller;

import com.mockito.crud.person.application.service.DeletePersonPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{id}")
public class DeletePersonController {

    @Autowired
    DeletePersonPort service;
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<String> deleteUser(@PathVariable Integer id){
        service.deletePerson(id);
        return ResponseEntity.ok().body("Person deleted");
    }

}
