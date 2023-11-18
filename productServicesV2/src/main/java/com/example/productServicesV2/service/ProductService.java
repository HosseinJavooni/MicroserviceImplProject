package com.example.productServicesV2.service;

import com.example.productServicesV2.entity.Product;
import com.example.productServicesV2.model.ProductRequest;
import com.example.productServicesV2.model.ProductResponse;

public interface ProductService {
    ProductResponse addProduct(ProductRequest request);
    ProductResponse getProduct(Long id);
}
