package com.proj1.q2;

import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
import java.util.EventObject;

// Custom Event Class
class CustomEvent extends EventObject {
    private String message;

    public CustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

// Custom Listener Interface
interface CustomListener extends EventListener {
    void handleCustomEvent(CustomEvent event);
}

// Custom Event Source
class EventSource {
    private CustomListener listener;

    public void addCustomListener(CustomListener listener) {
        this.listener = listener;
    }

    public void fireEvent(String message) {
        if (listener != null) {
            CustomEvent event = new CustomEvent(this, message);
            listener.handleCustomEvent(event);
        }
    }
}

// Custom Listener Implementation
class CustomListenerImpl implements CustomListener { // This should implement CustomListener
    public void handleCustomEvent(CustomEvent event) {
        System.out.println("Custom Event Received: " + event.getMessage());
    }
}

// Main class to demonstrate event handling
public class EventHandlingDemo {
    public static void main(String[] args) {
        // Default Event Handling
        Button button = new Button("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Custom Event Handling
        EventSource eventSource = new EventSource();
        CustomListener customListener = new CustomListenerImpl();
        eventSource.addCustomListener(customListener);
        eventSource.fireEvent("Custom Event Triggered");
    }
}
