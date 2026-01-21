package com.quickbook.offerservice.services;

import com.quickbook.offerservice.dto.PaymentRequest;
import com.quickbook.offerservice.dto.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {

    DiscountService discountService;
    OfferService offerService;

    public PaymentService(DiscountService discountService, OfferService offerService){
        this.discountService = discountService;
        this.offerService = offerService;
    }
    public PaymentResponse processPayment(PaymentRequest request) {
        double baseAmount = request.getSeatCount() * request.getPricePerSeat();
        double seatDiscount = discountService.applySeatDiscount(request.getSeatCount(), baseAmount);
        double paymentModeDiscount = discountService.applyPaymentModeDiscount(request.getPaymentMode(), baseAmount);
        double couponDiscount = offerService.applyCoupon(request.getCouponCode());
        double totalDiscount = seatDiscount + paymentModeDiscount + couponDiscount;
        double finalAmount = baseAmount - totalDiscount;

        PaymentResponse response = new PaymentResponse();
        response.setBookingId(request.getBookingId());
        response.setTotalAmount(BigDecimal.valueOf(baseAmount));
        response.setDiscount(BigDecimal.valueOf(totalDiscount));
        response.setFinalAmount(BigDecimal.valueOf(finalAmount));
        response.setPaymentStatus("SUCCESS");

        return response;
    }
}
