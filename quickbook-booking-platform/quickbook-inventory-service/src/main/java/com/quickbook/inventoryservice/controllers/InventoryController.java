package com.quickbook.inventoryservice.controllers;

import com.quickbook.inventoryservice.entities.SeatInventory;
import com.quickbook.inventoryservice.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vi/inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }

    @GetMapping("/{showId}")
    public SeatInventory getInventory(@PathVariable Long showId){
       return inventoryService.getInventory(showId);
    }

    @PostMapping("/lock")
    public String lockSeats(@RequestParam Long showId,
                            @RequestParam int seats){
        inventoryService.lockSeats(showId, seats);
        return "Seats locked successfully";
    }

    @PostMapping("/confirm")
    public String getInventory(@RequestParam Long showId,
                               @RequestParam int seats){
        inventoryService.confirmSeats(showId, seats);
        return "Seats confirmed successfully";
    }

    @GetMapping("/release")
    public String releaseSeats(@RequestParam Long showId,
                               @RequestParam int seats){
        inventoryService.releaseSeats(showId, seats);
        return "Seats released successfully";
    }
}
