package com.seniorproject.eventfoundry.eventfoundry.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<EventItem> ITEMS = new ArrayList<EventItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, String> EVENT_MAP = new HashMap<String, String>();

    static {
        // Add 3 sample items.
        addItem(new EventItem("1","Vegas Night", "11/26/2014 9:00 AM - 10:30 AM", "Come and out and play", "Vegas Strip", 26.00, "Take Over DJs", 1));
        //addItem(new EventItem("2", "Event 2"));
        //addItem(new EventItem("3", "Event 3"));
    }

    private static void addItem(EventItem event) {
        ITEMS.add(event);
        EVENT_MAP.put(event.eventID, event.toString());
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class EventItem {
        public String eventID;
        public String name;
        public String date;
        public String description;
        public String location;
        public Double price;
        public String host;
        public int iconID;

        public EventItem(String eventID, String name, String date, String description, String location, Double price,
                         String host, int iconID) {
            this.eventID = eventID;
            this.name = name;
            this.date = date;
            this.description = description;
            this.location = location;
            this.price = price;
            this.host = host;
            this.iconID = iconID;
        }
        public String geteventID(){
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

        public Double getPrice() {
            return price;
        }

        public String getHost() {
            return host;
        }

        public int getIconID() {
            return iconID;
        }

        @Override
        public String toString() {
            return name +"\n"+location+"\n"+date+"\n"+"$"+price;
        }
    }
}
