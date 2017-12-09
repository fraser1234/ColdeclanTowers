import java.util.ArrayList;

public class Hotel {

    private ArrayList<Guest> allGuests;

    public Hotel(){
        allGuests = new ArrayList<>();
    }

    public int countGuests(){
        return allGuests.size();
    }


    public void addGuest(Guest guest) {
        allGuests.add(guest);

    }

    public void removeGuest(Guest guest) {
        this.allGuests.remove(guest);
    }


}
