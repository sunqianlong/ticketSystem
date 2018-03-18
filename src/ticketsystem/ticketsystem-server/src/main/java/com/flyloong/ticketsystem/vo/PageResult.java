package com.flyloong.ticketsystem.vo;

import java.util.List;

import lombok.Data;

@Data
public class PageResult<T> {
    private int index;
    private List<T> data;
    private Long total;
    private Object tag;
}
