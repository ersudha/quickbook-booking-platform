package com.quickbook.authservice.services;

import com.quickbook.authservice.dto.AuthResponse;
import com.quickbook.authservice.dto.LoginRequest;
import com.quickbook.authservice.dto.RegisterRequest;
import com.quickbook.authservice.entities.JwtUtil;
import com.quickbook.authservice.entities.User;
import com.quickbook.authservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AuthService(UserRepository userRepository,JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public void register(RegisterRequest request){
        User user = new User();
        user.setUsername(request.getUserName());
        user.setPassword(encoder.encode(request.getPassword()));
        user.setRole("USER");
        userRepository.save(user);

    }

    public String login(LoginRequest request) {
        User user = userRepository.findByUsername(request.getUserName())
                .orElseThrow(() -> new RuntimeException("user not found"));

        if(!encoder.matches(request.getPassword(), user.getPassword())){
            throw new RuntimeException("invalid credentials");
        }
       return jwtUtil.generateToken(user.getUsername())  ;
    }
}
