package com.quickbook.offerservice.controllers;

import com.quickbook.offerservice.dto.PaymentRequest;
import com.quickbook.offerservice.dto.PaymentResponse;
import com.quickbook.offerservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public PaymentResponse processPayment(@RequestBody PaymentRequest request){
    return paymentService.processPayment(request);
    }
}
