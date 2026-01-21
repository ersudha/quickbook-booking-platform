package com.quickbook.offerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "payments")
public class Payment {
    @Id
    private Long id;
    private String bookingId;
    private double baseAmount;
    private double totalAmount;
    private double discountAmount;
    private double finalamount;
    private String paymentStatus;
    private String couponCode;
    private String transactionId;
    private String paymentMode;

    public Payment(){}

    public Payment(Long id, String bookingId, double baseAmount, double totalAmount, double discountAmount, double finalamount, String paymentStatus, String couponCode, String transactionId, String paymentMode) {
        this.id = id;
        this.bookingId = bookingId;
        this.baseAmount = baseAmount;
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.finalamount = finalamount;
        this.paymentStatus = paymentStatus;
        this.couponCode = couponCode;
        this.transactionId = transactionId;
        this.paymentMode = paymentMode;
    }
}
