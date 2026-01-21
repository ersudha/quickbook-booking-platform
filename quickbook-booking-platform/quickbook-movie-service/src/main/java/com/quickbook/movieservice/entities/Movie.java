package com.quickbook.movieservice.entities;

import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Table(name ="movies")
public class Movie {
    private Long id;
    private String title;
    private String language;
    private int duration;
    private LocalDate releaseDate;
    private String rating;
}
