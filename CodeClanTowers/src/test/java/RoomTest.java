import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class RoomTest {
    Room room;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        room = new Room("Double", "West Wing", 2);
        guest1 = new Guest("Kenny Rodgers");
        guest2 = new Guest("Arnold Clark");
        guest3 = new Guest("Trevor Sinclair");
    }

    @Test
    public void roomStartsNoGuests(){
        assertEquals(0, room.numberOfGuests());
        assertEquals(true, room.isVacant());
    }

    @Test
    public void getName() {
        assertEquals("Double", room.getName());

    }


    @Test
    public void getLocation(){
        assertEquals("West Wing", room.getLocation());
    }

    @Test
    public void canCheckInGuest() {
        room.checkIn(guest1);
        assertEquals(1, room.numberOfGuests());
        assertEquals(false, room.isVacant());
    }

    @Test
    public void canCheckoutGuest() {
        room.checkIn(guest1);
        room.checkOut();
        assertEquals(true, room.isVacant());
        assertEquals(0, room.numberOfGuests());
    }

    @Test
    public void canGetGuestsCheckedIntoRoom() {
        room.checkIn(guest1);
        ArrayList<Guest> guests = room.getGuests();
        assertEquals(1, guests.size());
        assertEquals("Kenny Rodgers", guests.get(0).getName());
    }


}
