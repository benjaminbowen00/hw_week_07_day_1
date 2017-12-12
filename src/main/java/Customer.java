public class Customer implements ICustomer {
    private String name;
    private int age;
    private double height;
    private double money;

    public Customer(String name, int age, double height, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public boolean hasEnoughMoney(Ride ride){
        return this.money >= ride.getPrice();
    }

    public boolean isOldEnough(Ride ride){
        return this.age >= ride.getMinAge();
    }

    public boolean isTallEnough(Rollercoaster rollercoaster){
        return this.height >= rollercoaster.getMinHeight();
    }
}
