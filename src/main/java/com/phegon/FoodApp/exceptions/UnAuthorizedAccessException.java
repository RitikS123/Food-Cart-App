package com.phegon.FoodApp.exceptions;

public class UnAuthorizedAccessException extends RuntimeException{
    public UnAuthorizedAccessException(String message)
    {
        super(message);
    }
}
