package com.example.productService.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
@Data
@Builder
public class ProductResponse {
    private Long productId;
    private String productName;
    private Long price;
    private Long quantity;
}
