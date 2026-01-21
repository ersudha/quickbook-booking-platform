package com.quickbook.inventoryservice.services;

import com.quickbook.inventoryservice.entities.SeatInventory;
import com.quickbook.inventoryservice.repositories.SeatInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class InventoryService {

    @Autowired
    SeatInventoryRepository seatInventoryRepository;

    public InventoryService(SeatInventoryRepository seatInventoryRepository){
        this.seatInventoryRepository = seatInventoryRepository;
    }

    public SeatInventory getInventory(Long showId) {
        return  seatInventoryRepository.findByShowId(showId).orElseThrow(() -> new RuntimeException("show inventory not found"));
    }


    public void lockSeats(Long showId, int seats) {
        SeatInventory inventory = getInventory(showId);
        if(inventory.getAvailableSeats() < seats){
            throw new RuntimeException("Not enough seat available");
        }

        inventory.setAvailableSeats(inventory.getAvailableSeats() - seats);
        inventory.setLockedSeats(inventory.getLockedSeats() + seats);
        inventory.setLockExpiryTime(LocalDateTime.now().plusMinutes(10));
    }

    public void confirmSeats(Long showId, int seats) {
        SeatInventory inventory = getInventory(showId);
        inventory.setLockedSeats(inventory.getLockedSeats() - seats);
        seatInventoryRepository.save(inventory);
    }

    public void releaseSeats(Long showId, int seats) {
        SeatInventory inventory = getInventory(showId);
        inventory.setLockedSeats(inventory.getLockedSeats() - seats);
        inventory.setAvailableSeats(inventory.getAvailableSeats() + seats);
        seatInventoryRepository.save(inventory);
    }
}
