import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom("Master Suite", "London", BedroomType.KING, 11, 100.00  );
    }

    @Test
    public void getBedroomName(){
        assertEquals("Master Suite", bedroom.getBedroomName());
    }

    @Test
    public void getBedroomLocation(){
        assertEquals("London", bedroom.getBedroomLocation());
    }

    @Test
    public void getBedroomType(){
        assertEquals(BedroomType.KING, bedroom.getBedroomType());
    }

    @Test
    public void getBedroomNumber(){
        assertEquals(11, bedroom.getBedroomNumber());
    }
    @Test
    public void getBedroomPrice() {
        assertEquals(100.00, bedroom.getBedroomPrice(), 0.001);
    }

}
