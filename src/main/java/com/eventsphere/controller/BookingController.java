package com.eventsphere.controller;

import com.eventsphere.entity.Event;
import com.eventsphere.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        Booking createdBooking = bookingService.createBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBooking);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
        Booking booking = bookingService.getBookingById(id);
        if(booking!=null){
            return ResponseEntity.ok(booking);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        //return booking.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<List<Booking>> getBookingsByEvent(@PathVariable Long eventId) {
        Event event = new Event(); // Fetch event by ID
        List<Booking> bookings = bookingService.getBookingsByEvent(event);
        return ResponseEntity.ok(bookings);
    }
}

