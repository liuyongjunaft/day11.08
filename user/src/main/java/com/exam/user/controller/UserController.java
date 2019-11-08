package com.exam.user.controller;

import com.exam.user.common.ResponseResult;
import com.exam.user.domain.vo.UserVo;
import com.exam.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/{uid}")
    public ResponseResult<UserVo> list(@PathVariable int uid){
        UserVo userVo = userService.getUserVo(uid);
        return ResponseResult.success(userVo);
    }
}
