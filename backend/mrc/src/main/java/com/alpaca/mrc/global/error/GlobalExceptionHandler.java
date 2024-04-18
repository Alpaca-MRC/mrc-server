package com.alpaca.mrc.global.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice(basePackages = "com.alpaca.mrc")
public class GlobalExceptionHandler {

    @ExceptionHandler( Exception.class )
    public ResponseEntity<Object> handleAll(final Exception ex) {
        log.error("handleAll", ex);
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }}
