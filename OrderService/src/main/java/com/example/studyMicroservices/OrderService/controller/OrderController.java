package com.example.studyMicroservices.OrderService.controller;

import com.example.studyMicroservices.OrderService.model.OrderCreateRequest;
import com.example.studyMicroservices.OrderService.model.OrderCreateResponse;
import com.example.studyMicroservices.OrderService.service.OrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Log4j2
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/placeOrder")
    public ResponseEntity<OrderCreateResponse> createOrder(@RequestBody OrderCreateRequest request){
        return new ResponseEntity<>(orderService.createOrder(request), HttpStatus.CREATED);
    }
}
