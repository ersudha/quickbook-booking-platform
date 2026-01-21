package com.quickbook.offerservice.services;

import com.quickbook.offerservice.entities.BookingContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class ThirdTicketDiscount implements DiscountStrategy {

    /*@Override
    public double apply(BookingContext context) {
        if (context.getTicketCount() >= 3) {
            double thirdTicketPrice = context.getBaseAmount() / context.getTicketCount();
            return thirdTicketPrice * 0.5;
        }
        return 0;
    }*/
}