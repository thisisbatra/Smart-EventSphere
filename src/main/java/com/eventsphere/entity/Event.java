package com.eventsphere.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long organizerId;

    @Column(nullable = false)
    private String eventName;

    private String description;

    private LocalDateTime eventDateTime;

    private String venue;

    private LocalDateTime timeStamp;


    public Event() {
    }


}
