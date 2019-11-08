package com.exam.order.domain.vo;


import com.exam.dubboapi.dto.OrderDto;
import lombok.Data;

import java.util.List;

@Data
public class PayVo {
    private int payId;
    private String orderNumber;
    private List<OrderDto> list;
}
