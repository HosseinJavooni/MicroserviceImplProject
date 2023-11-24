package com.example.productService.controller;

import com.example.productService.model.ProductRequest;
import com.example.productService.model.ProductResponse;
import com.example.productService.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(("/product"))
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    // Sample request:
    // curl -vX POST "http://localhost:8080/product" -H "Content-Type:application/json" --data '{"name":"SAMSUNG-M33","price":12000, "quantity":12}' | json_pp
    @PostMapping
    public ResponseEntity<ProductResponse> addProduct(@RequestBody ProductRequest request){
        return new ResponseEntity<>(productService.addProduct(request), HttpStatus.CREATED);
    }
    // Sample request:
    // curl -vX GET "http://localhost:8080/product/1" | json_pp
    @GetMapping ("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id){
        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

}
