/**
 * Created by James.Kimani on 11/30/2014.
 */
public class Event {
    private String name;
    private String Date;
    private String Description;
    private String Location;
    private Double price;
    private String Host;
    private int iconID;

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double  price) {
        this.price = price;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public Event(String name, String date, String description, String location, Double price, String host, int iconID) {
        super();
        this.name = name;
        this.Date = date;
        this.Description = description;
        this.Location = location;
        this.price = price;
        this.Host = host;
        this.iconID = iconID;
    }
}
