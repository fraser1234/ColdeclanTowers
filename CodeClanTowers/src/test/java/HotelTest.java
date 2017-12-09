import org.junit.Before;
import org.junit.Test;

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
        hotel = new Hotel();
    }

    @Test
    public void hotelNoGuests(){
        assertEquals(0, hotel.countGuests());
    }

    @Test
    public void addGuestToHotel(){
        hotel.addGuest(guest1);
        assertEquals(1, hotel.countGuests());
    }

    @Test
    public void canRemoveGuest(){
        hotel.addGuest(guest1);
        assertEquals(1, hotel.countGuests());
        hotel.removeGuest(guest1);
        assertEquals(0, hotel.countGuests());
    }

    @Test
    public void addGuestToBedRoom(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void removeGuestFromBedRoom(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.countGuests());
        bedroom1.checkOutGuest(guest1);
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void addGuestToConferenceRoom(){
        conference1.addGuest(guest1);
        assertEquals(1, conference1.countGuests());
    }

    @Test
    public void removeGuestFromConferenceRoom(){
        conference1.addGuest(guest1);
        assertEquals(1, conference1.countGuests());
        conference1.checkOutGuest(guest1);
        assertEquals(0, conference1.countGuests());
    }

    @Test
    public void checkThereIsEntry(){
        bedroom1.addGuest(guest2);
        bedroom1.getFirstGuest();
        assertEquals(1, bedroom1.countGuests());
    }
}
