package com.jason.demo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("分页数据")
public class PageResponse<T> {

    @ApiModelProperty(value = "总数目")
    private int total;

    @ApiModelProperty(value = "单页数目")
    private int size;

    @ApiModelProperty(value = "页数")
    private int pages;

    @ApiModelProperty(value = "当前页")
    private int current;

    @ApiModelProperty(value = "列表记录")
    private List<T> records;
}
