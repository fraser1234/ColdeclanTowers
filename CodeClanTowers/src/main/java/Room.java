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


    public void addGuest(Guest guest) {
        guests.add(guest);

    }

    public int countGuests() {
        return guests.size();
    }

    public void checkOutGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public Guest getFirstGuest(){
        return guests.get(0);
    }
}
