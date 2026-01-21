package com.quickbook.movieservice.repositories;

import com.quickbook.movieservice.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContainingIgnoreCase(String keyword);

    List<Movie> findByLanguage(String language);
}
