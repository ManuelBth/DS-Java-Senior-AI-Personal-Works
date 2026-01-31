package com.devsenior.domain.exceptions;

public class DataBaseTimeOutException extends RuntimeException {
    
    public DataBaseTimeOutException(String message, Throwable cause) {
        super(message, cause);
    }

}
