package com.quickbook.showservice.controllers;

import com.quickbook.showservice.entities.Show;
import com.quickbook.showservice.repositories.ShowRepository;
import com.quickbook.showservice.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    ShowService showService;

    @PostMapping
    public Show create(@RequestBody Show show) {
        return showRepository.save(show);
    }

    @GetMapping("/search")
    public List<Show> search(
            @RequestParam Long movieId,
            @RequestParam String city,
            @RequestParam LocalDate date) {
        return showService.search(movieId, city, date);
    }
}
