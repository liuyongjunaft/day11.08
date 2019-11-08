package com.exam.alipay.service;

import com.exam.dubboapi.OrderService;
import com.exam.dubboapi.dto.OrderDto;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlipayOrderServiceImpl implements OrderService {
    @Override
    public List<OrderDto> getOrders() {
        ArrayList<OrderDto> orderDtos = new ArrayList<>();
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderId(1);
        orderDto.setStatus("已支付");
        orderDto.setPayId("44444jdasl874");
        orderDtos.add(orderDto);
        return orderDtos;
    }
}
