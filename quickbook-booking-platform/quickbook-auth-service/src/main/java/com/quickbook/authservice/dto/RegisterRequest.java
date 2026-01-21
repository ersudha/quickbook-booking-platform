package com.quickbook.authservice.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String userName;
    private String password;
}
