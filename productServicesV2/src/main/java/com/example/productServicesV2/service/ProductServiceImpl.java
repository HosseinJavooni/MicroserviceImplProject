package com.example.productServicesV2.service;

import com.example.productServicesV2.entity.Product;
import com.example.productServicesV2.exception.productNotFoundException;
import com.example.productServicesV2.model.ProductRequest;
import com.example.productServicesV2.model.ProductResponse;
import com.example.productServicesV2.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public ProductResponse addProduct(ProductRequest request) {
        Product product = Product.builder()
                .productName(request.getName())
                .price(request.getPrice())
                .quantity(request.getQuantity()).build();
        return convertToProductResponse(productRepository.save(product));
    }

    private ProductResponse convertToProductResponse(Product product) {
        return ProductResponse.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .quantity(product.getQuantity()).build();
    }
    @Override
    public ProductResponse getProduct(Long id){
        return convertToProductResponse(productRepository.findById(id).orElseThrow(() -> new productNotFoundException("PRODUCT_NOT_FOUND", "Product with id: " + id + " not found!")));
    }
}
