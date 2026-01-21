package com.quickbook.movieservice.services;

import com.quickbook.movieservice.entities.Movie;
import com.quickbook.movieservice.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    public List<Movie> getMovieByLanguage(String language) {
        return movieRepository.findByLanguage(language);
    }

    public List<Movie> searchMovie(String keyword) {
        return movieRepository.findByTitleContainingIgnoreCase(keyword);
    }
}
