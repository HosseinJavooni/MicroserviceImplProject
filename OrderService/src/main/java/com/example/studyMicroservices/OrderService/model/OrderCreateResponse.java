package com.example.studyMicroservices.OrderService.model;

import lombok.*;

import javax.persistence.Column;
import java.time.Instant;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCreateResponse {
    private Long id;
    private Long productId;
    private Long quantity;
    private Instant orderDate;
    private String orderStatus;
    private Long amount;
}
