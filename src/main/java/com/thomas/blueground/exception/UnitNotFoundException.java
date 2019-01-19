package com.thomas.blueground.exception;

public class UnitNotFoundException extends RuntimeException {

    public UnitNotFoundException (String errorMessage) {
        super(errorMessage);
    }
}
