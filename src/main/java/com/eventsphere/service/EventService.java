package com.eventsphere.service;

import com.eventsphere.entity.Event;
import com.eventsphere.entity.User;
import com.eventsphere.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    // Create a new event
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    // Get event by ID
    public Event getEventById(Long eventId) {
        return eventRepository.findById(eventId).orElseThrow(()-> new RuntimeException("event not found with id :"+eventId));
    }

    // Get all events by a specific organizer
    public List<Event> getEventsByOrganizer(User organizer) {
        return eventRepository.findByOrganizer(organizer);
    }

    // Delete an event by ID
    public void deleteEvent(Long eventId) {
        eventRepository.deleteById(eventId);
    }
}

