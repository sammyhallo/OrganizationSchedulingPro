package com.sakinramazan.micros.organizationschedulingpro.service;

import com.sakinramazan.micros.organizationschedulingpro.entity.Event;

import java.util.List;

public interface EventService {

    // CRUD ops
    List<Event> getAllEvents();

    Event getEvent(Integer id);

    Event createEvent(Event event);

    Event updateEvent(Event event);

    boolean deleteEvent(Integer id);

    List<Event> getEventsByOrganizationId(Integer organization_id);

}
