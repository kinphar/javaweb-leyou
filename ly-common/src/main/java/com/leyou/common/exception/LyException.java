package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ Author     : dqf
 * @ Date       : Create in 00:31 2019-05-29
 * @ Modified By: xxx
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyException extends RuntimeException {

    private ExceptionEnum exceptionEnum;
}
