package com.miaosha.error;

/**
 * @program: miaosha
 * @description:
 * @author: wangzm
 * @create: 2020-01-13
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
