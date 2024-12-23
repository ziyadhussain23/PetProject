package com.example.petproject;

public class NameNotFound extends RuntimeException {
    public NameNotFound(String message) {
        super(message);
    }
}
