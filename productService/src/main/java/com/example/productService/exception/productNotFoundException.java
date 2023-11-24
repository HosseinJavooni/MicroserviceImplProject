package com.example.productService.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class productNotFoundException extends RuntimeException{
    private String errorCode;
    private String errorMessage;
}
