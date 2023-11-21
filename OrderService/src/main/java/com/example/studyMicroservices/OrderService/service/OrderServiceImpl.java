package com.example.studyMicroservices.OrderService.service;

import com.example.studyMicroservices.OrderService.entity.Order;
import com.example.studyMicroservices.OrderService.model.OrderCreateRequest;
import com.example.studyMicroservices.OrderService.model.OrderCreateResponse;
import com.example.studyMicroservices.OrderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository;
    @Override
    public OrderCreateResponse createOrder(OrderCreateRequest request) {
        var orderCreateResponse = orderRepository.save(convertRequestToEntity(request));
        return convertEntityToOrderCreateResponse(orderCreateResponse);
    }

    private OrderCreateResponse convertEntityToOrderCreateResponse(Order orderCreateResponse) {
        return OrderCreateResponse.builder()
                .id(orderCreateResponse.getId())
                .amount(orderCreateResponse.getAmount())
                .orderStatus(orderCreateResponse.getOrderStatus())
                .productId(orderCreateResponse.getProductId())
                .orderDate(orderCreateResponse.getOrderDate())
                .quantity(orderCreateResponse.getQuantity())
                .build();
    }

    private Order convertRequestToEntity(OrderCreateRequest request) {
        return Order.builder()
                .amount(request.getTotalAmount())
                .productId(request.getProductId())
                .orderStatus("CREATED")
                .orderDate(Instant.now())
                .quantity(request.getQuantity())
                .build();
    }
}
