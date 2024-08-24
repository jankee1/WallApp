package com.wallapp.WallApp.exception;

public class ValidationException extends RuntimeException {
    private final String errorMessage;

    public ValidationException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}