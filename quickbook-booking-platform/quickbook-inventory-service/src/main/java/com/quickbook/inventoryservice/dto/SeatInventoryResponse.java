package com.quickbook.inventoryservice.dto;

import lombok.Data;

public class SeatInventoryResponse {
    private Long showId;
    private int availableSeats;
    private int lockedSeats;
    private int bookedSeats;
    private String status;

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
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

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
