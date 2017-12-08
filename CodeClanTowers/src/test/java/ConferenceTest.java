import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Conference conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new Conference("Court Room", "South Wing", ConferenceType.CASHMERE, 500.00);
    }

    @Test
    public void getConferenceName(){
        assertEquals("Court Room", conferenceRoom.getConferenceName());
    }

    @Test
    public void getConferenceLocation(){
        assertEquals("South Wing", conferenceRoom.getConferenceLocation());
    }

    @Test
    public void getConferenceType(){
        assertEquals(ConferenceType.CASHMERE, conferenceRoom.getConferenceType());
    }

    @Test

    public void getConferencePrice(){
        assertEquals(500.00, conferenceRoom.getConferencePrice(), 0.001);
    }

    @Test
    public void getCapacityFromEnum(){
        assertEquals(200, conferenceRoom.getCapacityFromEnum());
    }

}
