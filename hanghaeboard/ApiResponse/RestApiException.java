package com.sparta.hanghaeboard.ApiResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class RestApiException {
    private String errorMessage;
    private HttpStatus httpStatus;
}