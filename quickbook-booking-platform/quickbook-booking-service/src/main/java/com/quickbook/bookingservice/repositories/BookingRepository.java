package com.quickbook.bookingservice.repositories;

import com.quickbook.bookingservice.entities.Booking;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookingRepository {
    public void save(Booking booking) {
    }

    public List<Booking> getBookingsByUserId(Long userId) {
        return null;
    }
}
