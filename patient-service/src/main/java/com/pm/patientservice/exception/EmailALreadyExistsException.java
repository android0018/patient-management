package com.pm.patientservice.exception;

public class EmailALreadyExistsException extends RuntimeException {
    public EmailALreadyExistsException(String message) {
        super(message);
    }
}
