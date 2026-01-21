package com.quickbook.theatreservice.repositories;

import com.quickbook.theatreservice.entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {
    public Theatre save(Theatre theatre);
    List<Theatre> findByCity(String city);
}
