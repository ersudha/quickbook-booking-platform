package com.quickbook.notificationservice.services;

import com.quickbook.notificationservice.dto.NotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class NotificationService {
    @Autowired
    EmailService emailService;

    @Autowired
    SMSService smsService;

    public NotificationService(EmailService emailservice, SMSService smsService){
        this.emailService = emailservice;
        this.smsService = smsService;
    }

    public String sendBookingConfirmation(NotificationRequest request){
        String message = builderMessage(request);

        return smsService.sendSMS(request.getPhoneNumber(), message);
    }

    private String builderMessage(NotificationRequest request) {
        return "Booking Confirmed ! \n \n"
                +"Booking ID: " + request.getBookingId() + "\n"
                +"Movie : " + request.getMovieName() + "\n"
                +"Theatre : " + request.getTheatre() + "\n"
                +"Show Time : " + request.getShowTime() + "\n"
                +"Seats : " + request.getSeats() + "\n"
                +"Enjoy your movie !!";
    }
}
