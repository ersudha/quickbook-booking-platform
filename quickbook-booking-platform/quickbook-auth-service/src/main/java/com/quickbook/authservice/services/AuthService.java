package com.quickbook.authservice.services;

import com.quickbook.authservice.dto.JwtResponse;
import com.quickbook.authservice.dto.LoginRequest;
import com.quickbook.authservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    public JwtResponse login(String userName, String password) {
        return null;
    }
}
