package com.miaoshaproject.error;

/**
 * @Author hly
 * @Date 2020/5/8 17:01
 * @Version 1.0
 */

//装饰器业务异常类实现
public class BussinessException extends Exception implements CommonError{

    private CommonError commonError;

    //直接接受EmBusinessError的传参用于构造业务异常
    public BussinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    //接受自定义errMsg的方式构造业务异常
    public BussinessException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
