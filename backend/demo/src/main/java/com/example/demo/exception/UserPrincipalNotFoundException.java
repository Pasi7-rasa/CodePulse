package com.example.demo.exception;

public class UserPrincipalNotFoundException extends RuntimeException {
    public UserPrincipalNotFoundException(String message) {
        super(message);
    }
}