package com.jason.demo.base;

import lombok.Data;

/**
 * http返回结果
 */
@Data
public class HttpResult {

  /**
   * 响应的状态码
   */
  private int code;

  /**
   * 响应体
   */
  private String body;

  /**
   * 构造函数
   *
   * @param code 响应的状态码
   * @param body 响应体
   */
  public HttpResult(int code, String body){
    this.code = code;
    this.body = body;
  }


}
