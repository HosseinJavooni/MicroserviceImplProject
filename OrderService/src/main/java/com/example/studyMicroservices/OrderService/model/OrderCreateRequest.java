package com.example.studyMicroservices.OrderService.model;

import lombok.*;

import java.time.Instant;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCreateRequest {
    private Long productId;
    private Long totalAmount;
    private Long quantity;
    private PaymentMode paymentMode;
}
