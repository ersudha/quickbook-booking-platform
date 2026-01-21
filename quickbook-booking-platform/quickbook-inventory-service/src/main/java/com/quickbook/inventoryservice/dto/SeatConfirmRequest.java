package com.quickbook.inventoryservice.dto;

import lombok.Data;

@Data
public class SeatConfirmRequest {
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
