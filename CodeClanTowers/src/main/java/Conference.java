import java.util.ArrayList;

public class Conference extends Room{

    private ConferenceType type;
    private double price;

    public Conference(String name, String location, ConferenceType type, double price) {
        super(name, location);
        this.type = type;
        this.price = price;
    }


    public String getConferenceName() {
        return name;
    }

    public String getConferenceLocation() {
        return location;
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
