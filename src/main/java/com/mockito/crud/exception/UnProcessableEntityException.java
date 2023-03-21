package com.mockito.crud.exception;

import lombok.Data;

import java.util.Date;
@Data
public class UnProcessableEntityException  extends RuntimeException {

    Date timeStamp;
    private int httpCode;

    public UnProcessableEntityException(String message, int httpCode, Date timeStamp) {
        super(message);
        this.httpCode = httpCode;
        this.timeStamp = timeStamp;
    }
}
