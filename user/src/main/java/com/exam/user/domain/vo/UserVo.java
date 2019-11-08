package com.exam.user.domain.vo;

import com.exam.user.domain.dto.PayVo;
import lombok.Data;

import java.util.List;

@Data
public class UserVo {

    private int uId;
    private String username;
    private List<PayVo> payVos;
}
