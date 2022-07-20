package com.cos.bitter.handler.ex;

import java.util.Map;

public class CustomValidationExcepton extends RuntimeException{
    private static final long serialVerisonUID = 1L;

    private Map<String, String> errorMap;

    public CustomValidationExcepton(String message, Map<String, String> errorMap){
        super(message);
        this.errorMap = errorMap;
    }

    public Map<String, String> getErrorMap(){
        return errorMap;
    }
}
