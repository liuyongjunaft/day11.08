package com.exam.order.service.Impl;

import com.exam.dubboapi.OrderService;
import com.exam.dubboapi.dto.OrderDto;
import com.exam.order.domain.vo.PayVo;
import com.exam.order.service.PayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PayServiceImpl implements PayService {
    @Reference
    OrderService orderService;

    @Override
    public List<PayVo> getPayVo() {
        List<OrderDto> orders = orderService.getOrders();
        ArrayList<PayVo> payVos = new ArrayList<>();
        PayVo payVo = new PayVo();
        payVo.setList(orders);
        payVo.setPayId(123);
        payVo.setOrderNumber("789794564163");
        payVos.add(payVo);
        return payVos;
    }
}
