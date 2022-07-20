package com.cos.bitter.controller;


import com.cos.bitter.domain.user.Users;
import com.cos.bitter.handler.ex.CustomValidationExcepton;
import com.cos.bitter.service.AuthService;
import com.cos.bitter.web.dto.auth.SignupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@RequiredArgsConstructor
@Controller
public class AuthController {

   // private static final Logger log = (Logger) LoggerFactory.getLogger(AuthController.class);

    private final AuthService authService;

    @GetMapping("/auth/signin")
    public String signForm(){
        return "auth/sigin";
    }

    @GetMapping("/auth/signup")
    public String signupForm(){
        return "auth/signup";
    }



    @PostMapping("/auth/signup")
    public String signup(@Valid SignupDto signupDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            Map<String,String> errorMap = new HashMap<>();

            for(FieldError error : bindingResult.getFieldErrors()){
                errorMap.put(error.getField(), error.getDefaultMessage());
                System.out.println(error.getDefaultMessage());
            }
            throw new CustomValidationExcepton("유효성 검사 실패함", errorMap);
        }else{
            Users users = signupDto.toEntity();
            Users userEntity = authService.회원가입(users);
            System.out.println(userEntity);
        }

        //Users user = signupDto.toEntity();

        //Users userEntity = authService.회원가입(user);
        //System.out.println(userEntity);

        return "auth/signin";
    }

}
