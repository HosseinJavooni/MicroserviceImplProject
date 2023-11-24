package com.example.productService.service;

import com.example.productService.model.ProductRequest;
import com.example.productService.model.ProductResponse;

public interface ProductService {
    ProductResponse addProduct(ProductRequest request);
    ProductResponse getProduct(Long id);
}
