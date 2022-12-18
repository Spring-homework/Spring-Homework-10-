package com.sparta.hanghaeboard.ApiResponse;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ApiResult {
    private final LocalDateTime timestamp =  LocalDateTime.now();
    private final int status;
    private final String message;
    private final Object response;
    private final  ErrorCode error;
    public ApiResult(SuccessCode successCode, Object response, ErrorCode error){

        // 성공 코드 존재시 성공코드를 대입, 부존재시 에러코드를 대입
        if (successCode != null){
            this.status = successCode.getHttpStatus().value();
            this.message = successCode.getDetail();
        } else {
            this.status = error.getHttpStatus().value();
            this.message = error.getDetail();
        }
        this.response = response;
        this.error = error;
    }
}
