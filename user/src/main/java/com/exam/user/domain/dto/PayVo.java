package com.exam.user.domain.dto;


import lombok.Data;

import java.util.List;

@Data
public class PayVo {
    private int payId;
    private String orderNumber;
    private List<OrderDto> list;
}
