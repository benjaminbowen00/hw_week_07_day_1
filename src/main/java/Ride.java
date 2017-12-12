import java.util.ArrayList;

public abstract class Ride implements IRide{
    private String name;
    private int minAge;
    private double price;
    private boolean waterRide;
    protected ArrayList<Customer> riders;

    public Ride(String name, int minAge, double price, boolean waterRide){
        this.name = name;
        this.minAge = minAge;
        this.price = price;
        this.waterRide = waterRide;
        this.riders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMinAge() {
        return minAge;
    }

    public double getPrice() {
        return price;
    }

    public boolean isWaterRide() {
        return waterRide;
    }

    public int getNumberOfRiders(){
        return this.riders.size();
    }

    public String startRide(){
        return "Your favourite rollercoaster " + this.name + " is starting";
    }

    public void removeCustomers(){
        this.riders.clear();
    }
}
