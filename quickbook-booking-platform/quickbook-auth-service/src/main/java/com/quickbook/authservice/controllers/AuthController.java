package com.quickbook.authservice.controllers;

import com.quickbook.authservice.dto.JwtResponse;
import com.quickbook.authservice.dto.LoginRequest;
import com.quickbook.authservice.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    //@PostMapping("/login")
    /*public AuthResponse login(@RequestBody LoginRequest request) {
        return authService.login(request.getUserName(), request.getPassword());
    }*/
}
