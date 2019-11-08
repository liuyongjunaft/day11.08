package com.exam.wechat.service;

import com.exam.dubboapi.OrderService;
import com.exam.dubboapi.dto.OrderDto;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDto> getOrders() {
        ArrayList<OrderDto> orderDtos = new ArrayList<>();
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderId(1);
        orderDto.setStatus("未支付");
        orderDto.setPayId("777121d3as4d56a");
        orderDtos.add(orderDto);
        return orderDtos;
    }
}
