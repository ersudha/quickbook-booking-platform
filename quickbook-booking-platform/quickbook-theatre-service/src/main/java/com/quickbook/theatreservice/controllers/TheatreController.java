package com.quickbook.theatreservice.controllers;

import com.quickbook.theatreservice.entities.Screen;
import com.quickbook.theatreservice.entities.Theatre;
import com.quickbook.theatreservice.repositories.ScreenRepository;
import com.quickbook.theatreservice.repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TheatreController {

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    ScreenRepository screenRepository;
    @PostMapping
    public Theatre onboard(@RequestBody Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    @PostMapping("/{id}/screens")
    public Screen addScreen(@PathVariable Long id, @RequestBody Screen screen) {
        //screen.setTheatreId(id);
        return screenRepository.save(screen);
    }
}
