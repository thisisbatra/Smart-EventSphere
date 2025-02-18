package com.eventsphere.service;

import com.eventsphere.entity.Booking;
import com.eventsphere.entity.Event;
import com.eventsphere.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Create a booking
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    // Get booking by ID
    public Booking getBookingById(Long bookingId){
        return bookingRepository.findById(bookingId).orElseThrow(()-> new RuntimeException("Booking not found with id :"+bookingId));
    }

    // Get all bookings for a specific event
    public List<Booking> getBookingsByEvent(Event event) {
        return bookingRepository.findByEvent(event);
    }
}

