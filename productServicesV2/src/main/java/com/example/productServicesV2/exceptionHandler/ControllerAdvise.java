package com.example.productServicesV2.exceptionHandler;

import com.example.productServicesV2.exception.productNotFoundException;
import com.example.productServicesV2.model.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvise extends ResponseEntityExceptionHandler {
    @ExceptionHandler(productNotFoundException.class)
    public ResponseEntity<ErrorResponse> productNotfound(){
        return new ResponseEntity<>(new ErrorResponse("PRODUCT_NOT_FOUND", "Product with your id not found!"), HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return super.handleHttpRequestMethodNotSupported(ex, headers, status, request);
        return new ResponseEntity<>(new ErrorResponse("YOUR_HTTP_METHOD_IS_WRONG", "check your http method. you are using a wrong one!"), HttpStatus.METHOD_NOT_ALLOWED);
    }
}
