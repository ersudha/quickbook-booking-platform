package com.quickbook.showservice.services;

import com.quickbook.showservice.entities.Show;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ShowService {
    public List<Show> search(Long movieId, String city, LocalDate date) {
        return null;
    }
}
