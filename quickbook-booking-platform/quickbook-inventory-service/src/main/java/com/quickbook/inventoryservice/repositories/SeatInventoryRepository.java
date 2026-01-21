package com.quickbook.inventoryservice.repositories;

import com.quickbook.inventoryservice.entities.SeatInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeatInventoryRepository extends JpaRepository<SeatInventory, Long> {
    Optional<SeatInventory> findByShowId(Long showId);
}
