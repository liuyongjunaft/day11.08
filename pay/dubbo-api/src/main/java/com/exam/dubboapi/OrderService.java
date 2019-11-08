package com.exam.dubboapi;

import com.exam.dubboapi.dto.OrderDto;

import java.util.List;

public interface OrderService  {
    public List<OrderDto> getOrders();
}
