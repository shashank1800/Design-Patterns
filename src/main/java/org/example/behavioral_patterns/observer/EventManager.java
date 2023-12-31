package org.example.behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<EventListeners>> eventListeners = new HashMap<>();

    public void subscribe(String eventType, EventListeners listener) {
        if (!this.eventListeners.containsKey(eventType))
            this.eventListeners.put(eventType, new ArrayList<>());

        List<EventListeners> listeners = this.eventListeners.get(eventType);
        listeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListeners listener) {
        List<EventListeners> listeners = this.eventListeners.get(eventType);
        listeners.remove(listener);
    }

    public void notify(String eventType, String data) {
        for (EventListeners listener : this.eventListeners.get(eventType)) {
            listener.update(data);
        }
    }
}
