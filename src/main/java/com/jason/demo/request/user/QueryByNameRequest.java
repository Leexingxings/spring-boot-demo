package com.jason.demo.request.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@ApiModel("根据名称查找用户")
public class QueryByNameRequest {

    @ApiModelProperty(value = "名称", required = true, dataType = "String")
    @NotEmpty(message = "名称必须不为null且不为空")
    private String name;
}
