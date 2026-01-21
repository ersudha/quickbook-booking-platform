package com.quickbook.theatreservice.services;

import com.quickbook.theatreservice.entities.Theatre;
import com.quickbook.theatreservice.repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    TheatreRepository theatreRepository;

    public TheatreService(TheatreRepository theatreRepository){
        this.theatreRepository = theatreRepository;
    }

    public List<Theatre> getTheatreByCity(String city){
        return theatreRepository.findByCity(city);
    }

    public Theatre addTheatre(Theatre theatre){
        return theatreRepository.save(theatre);
    }
}
