package com.jason.demo.response;

import lombok.Data;
import java.util.List;

@Data
public class PageResponse<T> {

    private int total;
    private int size;
    private int pages;
    private int current;

    private List<T> data;
}