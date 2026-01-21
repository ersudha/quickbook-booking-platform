package com.quickbook.offerservice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class PaymentResponse {
    private String bookingId;
	private BigDecimal totalAmount;
    private BigDecimal baseAmount;
    private BigDecimal discount;
    private BigDecimal tax;
    private BigDecimal finalAmount;
    private String paymentStatus;

    public PaymentResponse(String bookingId, BigDecimal totalAmount, BigDecimal baseAmount, BigDecimal discount, BigDecimal tax, BigDecimal finalAmount, String paymentStatus) {
        this.bookingId = bookingId;
        this.totalAmount = totalAmount;
        this.baseAmount = baseAmount;
        this.discount = discount;
        this.tax = tax;
        this.finalAmount = finalAmount;
        this.paymentStatus = paymentStatus;
    }

    public PaymentResponse() {
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
