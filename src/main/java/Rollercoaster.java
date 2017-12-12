public class Rollercoaster extends Ride {

    double minHeight;

    public Rollercoaster(String name, int minAge, double price, double minHeight) {
        super(name, minAge, price, false);
        this.minHeight = minHeight;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void addCustomerToRide(Customer customer){
        if (customer.isOldEnough(this) && customer.hasEnoughMoney(this) && customer.isTallEnough(this)){
            this.riders.add(customer);
        }
    }
}
