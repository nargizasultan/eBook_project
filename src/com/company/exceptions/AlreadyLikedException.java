package com.company.exceptions;

public class AlreadyLikedException extends RuntimeException{
    public AlreadyLikedException() {
    }

    public AlreadyLikedException(String message) {
        super(message);
    }
}
