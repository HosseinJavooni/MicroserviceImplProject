package com.example.studyMicroservices.OrderService.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ORDER_DETAILS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "ORDER_DATE")
    private Instant orderDate;
    @Column(name = "STATUS")
    private String orderStatus;
    @Column(name = "AMOUNT")
    private Long amount;
}
