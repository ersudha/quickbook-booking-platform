package com.quickbook.notificationservice.services;

public class SMSService {

    public String sendSMS(String phoneNumber, String message){
        //integrate
        System.out.println("sending sms to " + phoneNumber);
        System.out.println(message);
        return message;
    }
}
