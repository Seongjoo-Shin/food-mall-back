package com.order.order.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.order.Dto.OrderDto;
import com.order.order.Service.OrderService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5137")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public List<OrderDto> getAllOrder() {
        return orderService.getAllOrder();
    }
}

