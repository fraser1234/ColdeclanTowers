import java.util.ArrayList;

public class Room {

    String name;
    String location;
    ArrayList<Guest> guests;
    

    public Room(String name, String location) {
        this.name = name;
        this.location = location;
        this.guests = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public String getLocation() {
        return location;
    }

    public int getGuestCount() {
        return guests.size();
    }

    public int addGuest() {
        return guests.size();
    }
}
