package pl.camp.it.model;

public class Vehicle {

    private String  brand;
    private String model;
    private int capacity;
    private double price;
    private boolean rent;
    private String vin;

    public Vehicle(String brand, String model, int capacity, double price, String vin)
    {
        this(brand, model, capacity, price);
        this.vin = vin;
    }

    public Vehicle(String brand, String model, int capacity, double price) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.price = price;
        this.rent = false;
    }

    public final String getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Vehicle{" )  //mozna usunac sb na poczatku i ; na koncu
        .append("brand=" )
        .append(this.brand)
        .append(", model=" )
        .append(this.model)
        .append(", capacity=" )
        .append(this.capacity)
        .append(", price=" )
        .append(this.price)
        .append(", rent=" )
        .append(this.rent)
        .append(", vin=" )
        .append(this.vin)
        .append("}").toString();

    }
}
