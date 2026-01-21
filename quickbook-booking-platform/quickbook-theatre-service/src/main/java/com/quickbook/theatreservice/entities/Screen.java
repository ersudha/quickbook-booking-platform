package com.quickbook.theatreservice.entities;

import jakarta.persistence.*;

@Entity
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long theatreId;
    private String name;
    private int totalSeats;
}
