package com.example.petproject;

public class IdNotFound extends RuntimeException {
    public IdNotFound(String message) {
        super(message);
    }
}
