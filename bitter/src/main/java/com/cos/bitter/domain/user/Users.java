package com.cos.bitter.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username",length = 20,unique = true)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "gender")
    private String gender;
    @Column(name = "helm")
    private String helm;
    @Column(name = "Weight")
    private String Weight;
    @Column()
    private String Role;
    private LocalDateTime createDate;





    @PrePersist
    public void createDate(){
        this.createDate = LocalDateTime.now();
    }
}
