package com.quickbook.offerservice.services;

import org.springframework.stereotype.Service;

@Service
public class OfferService {
    public double applyCoupon(String couponCode) {
        if(couponCode == null){
            return  0;
        }

        return 0;
    }
}
