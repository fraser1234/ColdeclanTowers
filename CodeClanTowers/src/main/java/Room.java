import java.util.ArrayList;

public class Room {

    String name;
    String location;
    private int capacity;
    ArrayList<Guest> guests;
    

    public Room(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return new ArrayList<>(guests);
    }

    public void checkIn(Guest guest) {
        if (!isFull()) {
            this.guests.add(guest);
        }
    }

    public boolean isFull() {
        return this.guests.size() == this.capacity;
    }

    public void checkOut() {
        this.guests.clear();
    }

    public int numberOfGuests() {
        return this.guests.size();
    }

    public boolean isVacant() {
        return numberOfGuests() == 0;
    }

    public void checkInGuests(ArrayList<Guest> guestsToCheckIn) {
        if ((guestsToCheckIn.size() > this.capacity) || !isVacant()) {
            return;
        }
        for (Guest guest : guestsToCheckIn) {
            checkIn(guest);
        }
    }



}
