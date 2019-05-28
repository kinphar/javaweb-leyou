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

    PRICE_CANNOT_BE_NULL(400, "价格不能为空！"),
    ;
    private int code;
    private String msg;
}