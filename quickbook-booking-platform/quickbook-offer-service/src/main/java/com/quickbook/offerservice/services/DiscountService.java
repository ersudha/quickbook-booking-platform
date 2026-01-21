package com.quickbook.offerservice.services;

import com.quickbook.offerservice.entities.BookingContext;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalTime;

@Service
public class DiscountService {

    public double applySeatDiscount(Integer seatCount, double baseAmount) {
        if(seatCount >=3){
            return baseAmount * 0.5;
        }
        return baseAmount;
    }

    public double applyPaymentModeDiscount(String paymentMode, double baseAmount) {
        if("UPI".equalsIgnoreCase(paymentMode)){
            return  baseAmount * 0.05;
        }
        return baseAmount;
    }

    public double applyAfterNoonShowDiscount(BookingContext context) {
        LocalTime time = context.getShowTime();
        if (!time.isBefore(LocalTime.NOON) && time.isBefore(LocalTime.of(16, 0))) {
            return context.getBaseAmount() * 0.20;
        }
        return 0;
    }
}
