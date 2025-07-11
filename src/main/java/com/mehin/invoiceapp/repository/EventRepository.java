package com.mehin.invoiceapp.repository;

import com.mehin.invoiceapp.domain.UserEvent;
import com.mehin.invoiceapp.enumeration.EventType;

import java.util.Collection;


public interface EventRepository {
    Collection<UserEvent> getEventsByUserId(Long userId);
    void addUserEvent(String email, EventType eventType, String device, String ipAddress);
    void addUserEvent(Long userId, EventType eventType, String device, String ipAddress);

}
