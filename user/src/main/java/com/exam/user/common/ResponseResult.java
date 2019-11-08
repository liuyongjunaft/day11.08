package com.exam.user.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseResult<T> {

    private int status;
    private String msg;
    private T data;
    public static <T> ResponseResult success(T data){
        return ResponseResult.builder()
                .msg(ResultStatus.SUSSCES.getMsg())
                .status(ResultStatus.SUSSCES.getStatus())
                .data(data)
                .build();
    }
}
