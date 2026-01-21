package com.quickbook.movieservice.controllers;

import com.quickbook.movieservice.entities.Movie;
import com.quickbook.movieservice.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    MovieService movieService;
    
    public  MovieController(MovieService movieService){
        this.movieService = movieService;
    }
    
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return  movieService.addMovie(movie);
    }
    
    @GetMapping
    public List<Movie> getAllMovies(){
        return  movieService.getAllMovies();
    }

    @GetMapping("{id}")
    public Movie getMovie(@PathVariable Long id){
        return  movieService.getMovieById(id);
    }

    @GetMapping("/language/{language}")
    public List<Movie> getMovieByLanguage(@PathVariable String language){
        return  movieService.getMovieByLanguage(language);
    }

    @GetMapping("/search")
    public List<Movie> searchMovie(@RequestParam String keyword){
        return  movieService.searchMovie(keyword);
    }
}
