import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Conference conference1;
    Conference conference2;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Hotel hotel;

    @Before
    public void before(){
        bedroom1 = new Bedroom("Best Room", "South Wing", BedroomType.KING, 9, 300.00);
        bedroom2 = new Bedroom("Middle Room", "West Wing", BedroomType.DOUBLE, 3, 150.00);
        bedroom3 = new Bedroom("Worst Room", "North Wing", BedroomType.SINGLE, 13, 50.00);
        conference1 = new Conference("Wee Room", "Ground Floor", ConferenceType.TWEED, 100.00);
        conference2 = new Conference("Big Room", "Top Floor", ConferenceType.CASHMERE, 500.00);
        guest1 = new Guest("Shaun Praun");
        guest2 = new Guest("Mildew Cobblepot");
        guest3 = new Guest("Donkey Kong");
        hotel = new Hotel("Collesio");
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hotelNoGuests(){
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canGetGuestsCheckedIntoBedroom() {
        hotel.addBedroom(bedroom1);
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        bedroom1.checkInGuests(guestList);
        ArrayList<Guest> guests = hotel.getGuestsCheckedIntoBedroom(bedroom1.getNumber());
        assertEquals(1, guests.size());
        assertEquals("Shaun Praun", guests.get(0).getName());
    }
}
