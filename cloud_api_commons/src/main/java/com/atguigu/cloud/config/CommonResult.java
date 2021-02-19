package com.atguigu.cloud.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ycc
 * @created 2021/2/19 11:06
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult <T>{

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
