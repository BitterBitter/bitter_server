package com.cos.bitter.handler;

import com.cos.bitter.handler.ex.CustomValidationExcepton;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@ControllerAdvice
public class ControllerExceptionHandler{
    @ExceptionHandler(CustomValidationExcepton.class)
    public Map<String, String> validationException(CustomValidationExcepton e){
        return e.getErrorMap();
    }
}
