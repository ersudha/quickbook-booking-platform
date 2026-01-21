package com.quickbook.bookingservice.controllers;

import com.quickbook.bookingservice.dto.BookingRequest;
import com.quickbook.bookingservice.dto.BookingResponse;
import com.quickbook.bookingservice.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping
    public BookingResponse book(@RequestBody BookingRequest req) {
        return bookingService.book(req);
    }

    @PostMapping("/cancel/{id}")
    public void cancel(@PathVariable Long id) {
        bookingService.cancel(id);
    }
}
