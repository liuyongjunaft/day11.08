package com.exam.order.controller;

import com.exam.order.domain.vo.PayVo;
import com.exam.order.service.PayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PayController {
    @Resource
    private PayService payService;

    @RequestMapping("/list")
    public List<PayVo> getPayVo(){
       return payService.getPayVo();
    }
}
