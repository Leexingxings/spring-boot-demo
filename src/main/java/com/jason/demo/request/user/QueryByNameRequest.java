package com.jason.demo.request.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel("根据名称查找用户")
public class QueryByNameRequest {

    @ApiModelProperty(value = "名称", required = true, dataType = "String")
    @NotNull(message = "名称不能为空")
    private String name;
}
