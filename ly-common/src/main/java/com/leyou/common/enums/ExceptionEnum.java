package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ Author     : dqf
 * @ Date       : Create in 00:26 2019-05-29
 * @ Modified By: xxx
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    BRAND_NOT_FOUND(404, "品牌不存在"),
    CATEGORY_NOT_FOUND(404,"商品分类没查到"),
    BRAND_SAVE_ERROR(500,"新增品牌失败"),
    ;
    private int code;
    private String msg;
}
