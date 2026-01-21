package com.quickbook.inventoryservice.entities;

import lombok.Data;

import java.time.LocalDateTime;

public class SeatInventory {
    private Long id;
    private Long showId;
    private int totalSeats;
    private int availableSeats;
    private int lockedSeats;
    private LocalDateTime lockExpiryTime;

    public SeatInventory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getLockedSeats() {
        return lockedSeats;
    }

    public void setLockedSeats(int lockedSeats) {
        this.lockedSeats = lockedSeats;
    }

    public LocalDateTime getLockExpiryTime() {
        return lockExpiryTime;
    }

    public void setLockExpiryTime(LocalDateTime lockExpiryTime) {
        this.lockExpiryTime = lockExpiryTime;
    }
}
