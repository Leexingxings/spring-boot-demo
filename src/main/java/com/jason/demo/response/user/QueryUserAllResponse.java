package com.jason.demo.response.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QueryUserAllResponse {

    /**
     * 自增ID
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String name;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer age;
}
