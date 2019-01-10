package com.jason.demo.request.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QueryByNameRequest {

    @ApiModelProperty(value = "名称", required = true)
    private String name;
}
