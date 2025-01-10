package com.easybytes.cards.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resounceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with the given input data %s: '%S'", resounceName, fieldName, fieldValue));
    }
}
