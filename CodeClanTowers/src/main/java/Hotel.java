import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private String name;
    private DiningRoom diningRoom;
    private Conference conferenceRoom;

    public Hotel(String name){
        bedrooms = new ArrayList<Bedroom>();
    }

    public String getName() {
        return name;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public ArrayList<Guest> getGuestsCheckedIntoBedroom(int number) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                return room.getGuests();
            }
        }
        return new ArrayList<Guest>();
    }

    public void checkGuestsIntoBedroom(int number, ArrayList<Guest> guestList) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                room.checkInGuests(guestList);
                return;
            }
        }
    }



}
