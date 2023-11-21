package com.example.studyMicroservices.OrderService.service;

import com.example.studyMicroservices.OrderService.model.OrderCreateRequest;
import com.example.studyMicroservices.OrderService.model.OrderCreateResponse;

public interface OrderService {
    OrderCreateResponse createOrder(OrderCreateRequest request);
}
