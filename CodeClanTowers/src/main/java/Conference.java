import java.util.ArrayList;

public class Conference extends Room{

    private ConferenceType type;
    private double price;

    public Conference(String name, String location, ConferenceType type, double price) {
        super(name, location, type.getCapacity());
        this.type = type;
        this.price = price;
    }


    public ConferenceType getConferenceType() {
        return type;
    }

    public double getConferencePrice() {
        return price;
    }

    public int getCapacityFromEnum(){
        return this.type.getCapacity();
    }
}
