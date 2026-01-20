package com.quickbook.bookingservice.dto;

import com.quickbook.bookingservice.entities.BookingStatus;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class BookingResponse {
	private Long bookingId;
    private String status;
    private BigDecimal amount;
    private Long showId;
    private int seats;
    //private BookingStatus status;


    public BookingResponse(Long showId, int seats, BookingStatus status) {
        this.showId = showId;
        this.seats = seats;
        //this.status = status;
    }
}
