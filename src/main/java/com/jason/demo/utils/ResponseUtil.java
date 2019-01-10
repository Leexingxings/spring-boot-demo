package com.jason.demo.utils;

import com.jason.demo.base.ResponseData;
import com.jason.demo.constants.ResponseCode;

public class ResponseUtil {

    public static ResponseData success() {
        return ResponseData.build(ResponseCode.SUCCESS.getValue(), ResponseCode.SUCCESS.getMessage());
    }

    public static <T> ResponseData success(T data) {
        return new ResponseData(ResponseCode.SUCCESS.getValue(), ResponseCode.SUCCESS.getMessage(), data);
    }

    public static ResponseData fail() {
        return ResponseData.build(ResponseCode.FAILURE.getValue(), ResponseCode.FAILURE.getMessage());
    }

    public static ResponseData fail(String msg) {
        return ResponseData.build(ResponseCode.FAILURE.getValue(), msg);
    }

    public static ResponseData build(Integer code, String msg) {
        return ResponseData.build(code, msg);
    }

    public static boolean isSuccess(ResponseData respData) {
        if (respData != null && ResponseCode.SUCCESS.getValue() == respData.getCode()) {
            return true;
        }
        return false;

    }
}
