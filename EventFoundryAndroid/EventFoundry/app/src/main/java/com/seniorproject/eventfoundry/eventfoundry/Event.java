package com.seniorproject.eventfoundry.eventfoundry;

/**
 * Created by James.Kimani on 11/30/2014.
 */
public class Event {
    public String eventID;
    public String name;
    public String date;
    public String description;
    public String location;
    public String price;
    public String host;
    public int iconID;

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }

    public Event(String eventID, String name, String date, String description, String location, String price, String host, int iconID) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;
        this.description = description;
        this.location = location;
        this.price = price;
        this.host = host;
        this.iconID = iconID;
    }

    public String getEventID() {
        return eventID;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }

    public String getHost() {
        return host;
    }

    public int getIconID() {
        return iconID;
    }

}
