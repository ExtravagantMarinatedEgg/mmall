package com.mmall.common;

/**
 * 魔法数字 枚举类
 * 0    成功
 * 1    失败
 * 10   需要登录
 * 2    参数错误
 */
public enum  ResponseCode {

    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

    private final int code;     //代码
    private final String desc;  //描述

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }
}
