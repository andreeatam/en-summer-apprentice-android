package com.example.myapplication.model;
import java.util.Date;

public class Event {
    private int eventID;
    private int venueID;
    private int eventTypeID;
    private String eventDescription;
    private String eventName;
    private Date startDate;
    private Date endDate;

    public Event(int eventID, int venueID, int eventTypeID, String eventDescription, String eventName, Date startDate, Date endDate) {
        this.eventID = eventID;
        this.venueID = venueID;
        this.eventTypeID = eventTypeID;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getEventID() {
        return eventID;
    }

    public int getVenueID() {
        return venueID;
    }

    public int getEventTypeID() {
        return eventTypeID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}

