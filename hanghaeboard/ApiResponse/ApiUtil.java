package com.sparta.hanghaeboard.ApiResponse;

public class ApiUtil {

    // 성공 응답 (반환 데이터 존재)
    public static ApiResult successResponse(SuccessCode successCode, Object response){
        return new ApiResult(successCode, response, null);
    }

    // 에러 응답
    public static ApiResult errorResponse(ErrorCode errorCode){
        return new ApiResult(null, null, errorCode);
    }
}