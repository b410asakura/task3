package com20.task3.globalException;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}