package com.quickbook.bookingservice.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class BookingRequest {
	private Long userId;
    private Long showId;
    private int seatId;
    private List<String> seats;
    private BigDecimal payableAmount;
}
