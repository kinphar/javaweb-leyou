package com.leyou.item.service.Impl;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @ Author     : dqf
 * @ Date       : Create in 20:32 2019-06-06
 * @ Modified By: xxx
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryCategoryListByPid(Long pid) {
        Category t = new Category();
        t.setParentId(pid);
        List<Category> categoryList = categoryMapper.select(t);
        if (CollectionUtils.isEmpty(categoryList)) {
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return categoryList;
    }
}
