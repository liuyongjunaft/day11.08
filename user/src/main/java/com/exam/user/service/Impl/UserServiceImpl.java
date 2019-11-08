package com.exam.user.service.Impl;

import com.exam.user.domain.dto.PayVo;
import com.exam.user.domain.vo.UserVo;
import com.exam.user.service.DubboPayService;
import com.exam.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    DubboPayService dubboPayService;

    @Override
    public UserVo getUserVo(int uId) {
        List<PayVo> list = dubboPayService.list();
        UserVo userVo = new UserVo();
        userVo.setUId(uId);
        userVo.setPayVos(list);
        userVo.setUsername("zs");
        return userVo;
    }
}
