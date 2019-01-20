package com.thomas.blueground.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException (String errorMessage) {
        super(errorMessage);
    }
}
