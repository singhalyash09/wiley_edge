package com.onlineShoppingSystem.exceptions;

public class DuplicateProductIDException extends RuntimeException{
    public DuplicateProductIDException(String message) {
        super(message);
    }
}
