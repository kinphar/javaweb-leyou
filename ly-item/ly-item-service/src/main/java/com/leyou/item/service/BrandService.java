package com.leyou.item.service;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;

import java.util.List;

/**
 * @ Author     : dqf
 * @ Date       : Create in 11:27 2019-06-16
 * @ Modified By: xxx
 */
public interface BrandService {
    PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key);

    public void saveBrand(Brand brand, List<Long> cids);
}

