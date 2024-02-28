package com.springboot.blog.springbootblogrestapi.payload;

import lombok.Data;

@Data
public class SignupDto {
    private String name;
    private String email;
    private String password;
    private String username;
}
