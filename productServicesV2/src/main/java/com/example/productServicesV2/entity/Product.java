package com.example.productServicesV2.entity;

import lombok.*;

import javax.persistence.*;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRICE")
    private Long price;
    @Column(name = "QUANTITY")
    private Long quantity;
}
