package com.quickbook.offerservice.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
//@Data
public class BookingContext {
	private int ticketCount;
    private double baseAmount;
    private LocalTime showTime;
	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	public double getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}
	public LocalTime getShowTime() {
		return showTime;
	}
	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}
    
    
}
