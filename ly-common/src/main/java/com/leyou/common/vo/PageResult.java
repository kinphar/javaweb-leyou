package com.leyou.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @ Author     : dqf
 * @ Date       : Create in 11:41 2019-06-16
 * @ Modified By: xxx
 */
@Data
public class PageResult<T> {
    private Long total;
    private Integer totalPage;
    private List<T> items;

    public PageResult() {}

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}
