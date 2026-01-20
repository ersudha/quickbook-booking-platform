package com.quickbook.notificationservice.dto;

import lombok.Data;

@Data
public class NotificationRequest {
    private String userEmail;
    private String phoneNumber;
    private String movieName;
    private String theatre;
    private String showTime;
    private int seats;
    private String bookingId;

}
