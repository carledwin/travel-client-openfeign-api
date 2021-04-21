package com.carledwinti.travelclientopenfeignapi.exception;

public class ApiInternalServerException extends RuntimeException {
    public ApiInternalServerException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
