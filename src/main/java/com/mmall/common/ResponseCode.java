package com.mmall.common;

/**
 * 枚举类 enum
 */
public enum ResponseCode {
    //以下为自定义函数
    SUCCESS(0,"SUCCESS"),  //ResponseCode.SUCCESS.getCode() 会取得值为0
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

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
