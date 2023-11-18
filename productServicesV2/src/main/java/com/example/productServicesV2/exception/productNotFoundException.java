package com.example.productServicesV2.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class productNotFoundException extends RuntimeException{
    private String errorCode;
    private String errorMessage;
}
