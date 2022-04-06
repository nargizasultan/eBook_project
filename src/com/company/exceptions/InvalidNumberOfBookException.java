package com.company.exceptions;

public class InvalidNumberOfBookException extends RuntimeException{
    public InvalidNumberOfBookException() {
        super();
    }

    public InvalidNumberOfBookException(String message) {
        super(message);
    }
}
