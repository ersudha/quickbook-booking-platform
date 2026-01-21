package com.quickbook.inventoryservice.dto;

import lombok.Data;


public class SeatLockRequest {
    private long showId;
    private int seatCount;

    public long getShowId() {
        return showId;
    }

    public void setShowId(long showId) {
        this.showId = showId;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
