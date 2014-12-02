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
        addItem(new EventItem("1","Music"));
        addItem(new EventItem("2","Business"));
        addItem(new EventItem("3","Food & Drink"));
        addItem(new EventItem("4","Community"));
        addItem(new EventItem("5","Arts"));
        addItem(new EventItem("6","Film and Media"));
        addItem(new EventItem("7","Sports and Fitness"));
        addItem(new EventItem("8","Health"));
        addItem(new EventItem("9","Science and Tech"));
        addItem(new EventItem("10","Holiday"));
        addItem(new EventItem("11","Fashion"));
        addItem(new EventItem("12","Home and Lifestyle"));
        addItem(new EventItem("13","Auto, Boat & Air"));
        addItem(new EventItem("14","Hobbies"));
        addItem(new EventItem("15","Family and Education"));



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


        public String getEventID() {
            return eventID;
        }

        public String getName() {
            return name;
        }

        public EventItem(String eventID, String name) {
            this.eventID = eventID;
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
