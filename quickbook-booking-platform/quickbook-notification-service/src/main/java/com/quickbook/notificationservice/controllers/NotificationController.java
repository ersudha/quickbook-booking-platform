package com.quickbook.notificationservice.controllers;

import com.quickbook.notificationservice.dto.NotificationRequest;
import com.quickbook.notificationservice.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    public NotificationController(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    @PostMapping("/booking-confirmed")
    public String sendBookingconfirmation(@RequestBody NotificationRequest request){
        return notificationService.sendBookingConfirmation(request);
    }
}
