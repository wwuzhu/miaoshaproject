package com.miaoshaproject.error;

/**
 * @Author hly
 * @Date 2020/5/8 16:33
 * @Version 1.0
 */
public enum EmBusinessError implements CommonError{
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),

    UNKNOWN_ERROR(10002, "未知错误"),

    //20000开头表示用户信息相关错误
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002, "用户手机号或密码错误"),

    //30000开头为交易信息错误定义
    STOCK_NOT_ENOUGH(30001, "库存不足")
    ;

    EmBusinessError(int errCode, String errMsg) { //自动private
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;


    @Override
    public int getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}