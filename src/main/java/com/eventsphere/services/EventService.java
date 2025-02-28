package com.eventsphere.services;

import com.eventsphere.entity.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event event, Long organizerId);
    List<Event> getAllEvents();
    Event getEventById(Long eventId);
    List<Event> getEventsByOrganizer(Long organizerId);
    Event deleteEvent(Long eventId);
    Event updateEvent(Long eventId, Event updatedEvent);
}
