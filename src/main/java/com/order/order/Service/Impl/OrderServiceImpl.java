package com.order.order.Service.Impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.order.order.Dto.OrderDto;
import com.order.order.Service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	
	
    @Override
    public List<OrderDto> getAllOrder() {
    	
    	return Arrays.asList(
                new OrderDto("감자",1000),
                new OrderDto("고구마",500)
        );
    }
}
