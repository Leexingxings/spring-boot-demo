package com.jason.demo.request;

import com.jason.demo.constants.BaseConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;

@Data
public class PageRequest {

    @ApiModelProperty(value = "页数", dataType = "int")
    @Min(value = 1, message = "页码必须大于或等于1")
    private Integer page = BaseConstant.PAGE;

    @ApiModelProperty(value = "单页数目", dataType = "int")
    @Range(min = 1, max = 20, message = "每页记录数的值不合法")
    private Integer size = BaseConstant.PAGE_SIZE;
}
