public class LogFlume extends Ride {

    boolean rapids;

    public LogFlume(String name, int minAge, double price, boolean rapids) {
        super(name, minAge, price, true);
        this.rapids = rapids;
    }

    public boolean isRapids() {
        return rapids;
    }

    public void addCustomerToRide(Customer customer){
        if (customer.isOldEnough(this) && customer.hasEnoughMoney(this)){
            this.riders.add(customer);
        }
    }
}
