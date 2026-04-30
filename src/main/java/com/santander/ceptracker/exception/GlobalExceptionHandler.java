package com.santander.ceptracker.exception;

import com.santander.ceptracker.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleBadRequest(IllegalArgumentException ex) {
	return ResponseEntity.badRequest()
			.body(new ErrorResponse(LocalDateTime.now(), 400, ex.getMessage()));
    }

    @ExceptionHandler(CepNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleCepNotFound(CepNotFoundException ex) {
	return ResponseEntity.status(404)
			.body(new ErrorResponse(LocalDateTime.now(), 404, ex.getMessage()));
    }
}