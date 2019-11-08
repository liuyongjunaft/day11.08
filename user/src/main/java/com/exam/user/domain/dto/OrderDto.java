package com.exam.user.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDto implements Serializable {
    private int orderId;
    private String status;
    private String payId;
}
