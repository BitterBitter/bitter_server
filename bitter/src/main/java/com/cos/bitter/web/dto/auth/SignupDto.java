package com.cos.bitter.web.dto.auth;

import com.cos.bitter.domain.user.Users;
import com.cos.bitter.domain.user.Users;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;


@Data
public class SignupDto {
    @Max(20)
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
    @NotBlank
    private int age;
    @NotBlank
    private String gender;
    @NotBlank
    private String helm;
    @NotBlank
    private String Weight;


    public Users toEntity(){
        return Users.builder()
                .username(username)
                .password(password)
                .name(name)
                .age(age)
                .gender(gender)
                .helm(helm)
                .Weight(Weight)
                .build();
    }
}
