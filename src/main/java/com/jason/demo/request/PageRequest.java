package com.jason.demo.request;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.Min;

@Data
public class PageRequest {

    @Min(value = 1, message = "页码必须大于或等于1")
    private Integer page;

    @Range(min = 1, max = 20, message = "每页记录数的值不合法")
    private Integer size;
}
