import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private double price;
    private BedroomType type;

    public Bedroom(String name, String location, BedroomType type, int number, double price) {
        super(name, location);
        this.number = number;
        this.type = type;
        this.price = price;
    }


    public String getBedroomName() {
        return this.name;
    }

    public String getBedroomLocation() {
        return this.location;
    }

    public BedroomType getBedroomType() {
        return this.type;
    }

    public int getBedroomNumber() {
        return this.number;
    }

    public double getBedroomPrice() {
        return this.price;
    }
}
