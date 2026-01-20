package com.quickbook.bookingservice.services;

import com.quickbook.bookingservice.dto.BookingRequest;
import com.quickbook.bookingservice.dto.BookingResponse;
import com.quickbook.bookingservice.entities.Booking;
import com.quickbook.bookingservice.entities.BookingStatus;
import com.quickbook.bookingservice.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    //@Transactional
    public BookingResponse createBooking(BookingRequest request) {

        Booking booking = new Booking();
        booking.setUserId(request.getUserId());
        booking.setShowId(request.getShowId());
        //booking.setSeats(request.getSeats());
        booking.setStatus(BookingStatus.CONFIRMED);
        //booking.setPayableAmount(BigDecimal.valueOf(500));

        bookingRepository.save(booking);
        System.out.println("Status: "+ request.getShowId()+ " : " +booking.getSeats() +" : "+ booking.getStatus());

        return new BookingResponse(request.getShowId(), booking.getSeats(), booking.getStatus());

    }

    public List<Booking> getBookingsByUser(Long userId) {
        return bookingRepository.getBookingsByUserId(userId);
    }

    public BookingResponse book(BookingRequest req) {
        return null;
    }

    public void cancel(Long id) {

    }
}
