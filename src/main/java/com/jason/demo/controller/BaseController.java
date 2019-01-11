package com.jason.demo.controller;

import com.jason.demo.base.ResponseData;
import com.jason.demo.constants.ResponseCode;
import com.jason.demo.utils.ResponseUtil;
import org.springframework.validation.BindingResult;

/**
 * controller基类
 *
 * @author jason
 */
public class BaseController {

    /**
     * 获取错误响应
     *
     * @param result 报错信息
     * @return ResponseUtil
     */
    protected ResponseData getErrorResponse(BindingResult result) {
        //请求的数据参数格式不正确
        if (result.hasErrors()) {
//            String[] errArr = new String[result.getAllErrors().size()];
//            for (int i = 0; i < result.getAllErrors().size(); i++) {
//                errArr[i] = result.getAllErrors().get(i).getDefaultMessage();
//            }
//            String errMsg = StringUtils.join(errArr, ",");

            // 获取第一个报错信息
            String errMsg = result.getAllErrors().get(0).getDefaultMessage();

            return ResponseUtil.build(ResponseCode.PARAM_INVALID.getValue(), errMsg);
        }
        return null;
    }
}
