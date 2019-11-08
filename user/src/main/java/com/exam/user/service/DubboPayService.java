package com.exam.user.service;

import com.exam.user.domain.dto.PayVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("dubbo-order")
public interface DubboPayService {
    @RequestMapping("list")
    List<PayVo> list();
}
