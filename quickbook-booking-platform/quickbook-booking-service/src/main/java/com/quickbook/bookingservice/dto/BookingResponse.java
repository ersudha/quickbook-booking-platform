package com.quickbook.bookingservice.dto;

import com.quickbook.bookingservice.entities.BookingStatus;
import lombok.Data;

import java.math.BigDecimal;

public class BookingResponse {
	private Long bookingId;
    private BigDecimal amount;
    private Long showId;
    private int seats;
    private BookingStatus status;

    public BookingResponse() {
    }

    public BookingResponse(Long showId, int seats, BookingStatus status) {
        this.showId = showId;
        this.seats = seats;
        this.status = status;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
