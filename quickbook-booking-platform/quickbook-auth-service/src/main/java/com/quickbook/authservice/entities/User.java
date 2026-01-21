package com.quickbook.authservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private String role;
}
