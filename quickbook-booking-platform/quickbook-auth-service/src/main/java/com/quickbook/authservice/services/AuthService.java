package com.quickbook.authservice.services;

import com.quickbook.authservice.dto.JwtResponse;
import com.quickbook.authservice.dto.LoginRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public JwtResponse authenticate(LoginRequest req) {
        return null;
    }
}
