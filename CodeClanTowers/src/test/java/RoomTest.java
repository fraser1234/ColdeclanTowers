import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoomTest {
    Room room;

    @Before
    public void before(){
        room = new Room("Double", "West Wing");
    }

    @Test
    public void roomStartsNoGuests(){
        assertEquals(0, room.getGuestCount());
    }

    @Test
    public void getName() {
        assertEquals("Double", room.getName());

    }


    @Test
    public void getLocation(){
        assertEquals("West Wing", room.getLocation());
    }
}
