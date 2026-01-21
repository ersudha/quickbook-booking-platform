package com.quickbook.offerservice.services;

import com.quickbook.offerservice.entities.BookingContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

//@Component
public class AfternoonShowDiscount {//implements DiscountStrategy {

/*    @Override
    public double apply(BookingContext context) {
        LocalTime time = context.getShowTime();
        if (!time.isBefore(LocalTime.NOON) && time.isBefore(LocalTime.of(16, 0))) {
            return context.getBaseAmount() * 0.20;
        }
        return 0;
    }*/
}
