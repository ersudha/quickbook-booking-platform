package com.quickbook.common.util.exception;

import com.quickbook.common.util.dto.ApiResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
        public ApiResponse<?> handleBusinessException(BusinessException ex){
        return ApiResponse.faliure(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ApiResponse<?> handleGeneric(Exception ex){
        return ApiResponse.faliure("internal server errur");
    }
}
