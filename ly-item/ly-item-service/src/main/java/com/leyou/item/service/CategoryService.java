package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @ Author     : dqf
 * @ Date       : Create in 11:00 2019-06-08
 * @ Modified By: xxx
 */
public interface CategoryService {
    List<Category> queryCategoryListByPid(Long pid);
}
