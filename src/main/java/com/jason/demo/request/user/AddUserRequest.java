package com.jason.demo.request.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * 添加用户请求参数
 */
@Data
public class AddUserRequest {

    @ApiModelProperty(value = "名称", required = true, dataType = "String")
    @NotEmpty(message = "名称必须不为null且不为空")
    @Length(min = 0, max = 64)
    private String name;

    @ApiModelProperty(value = "邮箱", required = true, dataType = "String")
    @Email
    @NotEmpty(message = "邮箱必须不为null且不为空")
    @Length(min = 0, max = 100)
    private String email;

    @ApiModelProperty(value = "年龄", required = true, dataType = "Integer")
    @Range(min = 0, max = 200, message = "年龄超出合法区间值")
    @NotNull(message = "年龄必须不为null")
    private Integer age;
}
