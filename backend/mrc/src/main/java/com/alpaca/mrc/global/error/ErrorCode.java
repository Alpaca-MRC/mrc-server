package com.alpaca.mrc.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // COMMON
    COMMON_ERROR(400, "C400", "오류가 발생했습니다.");


    private final int status;
    private final String code;
    private final String message;
}
