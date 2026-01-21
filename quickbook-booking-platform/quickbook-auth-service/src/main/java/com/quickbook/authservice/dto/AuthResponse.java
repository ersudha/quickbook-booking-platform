package com.quickbook.authservice.dto;

import org.springframework.stereotype.Component;

@Component
public class AuthResponse {
    private String token;

    public AuthResponse(String token){
        this.token = token;
    }
}
