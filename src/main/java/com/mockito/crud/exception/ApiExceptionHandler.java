package com.mockito.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {EntityNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<CustomError> handlerEntityNotFoundException(EntityNotFoundException e){
            CustomError customError = new CustomError(e.getMessage(),e.getHttpCode());
            return ResponseEntity.status(404).body(customError);
    }

    @ExceptionHandler(value = {UnProcessableEntityException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ResponseEntity<CustomError> handlerUnProcessableEntityNotFoundException(UnProcessableEntityException e){
        CustomError customError = new CustomError(e.getMessage(),e.getHttpCode());
        return ResponseEntity.status(422).body(customError);
    }



}
