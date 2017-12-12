import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Megafobia", 12, 1.99, 1.50);
        customer1 = new Customer("Short Shirley", 11, 1.40, 4.00);
        customer2 = new Customer("Mikey", 14, 1.50, 9.99);
        customer3 = new Customer("Poor Peter", 20, 2.00,1);
    }

    @Test
    public void canGetMinAge(){
        assertEquals(12, rollercoaster.getMinAge());
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(1.50, rollercoaster.getMinHeight(), 0.01);
    }

    @Test
    public void canAddRider(){
        rollercoaster.addCustomerToRide(customer2);
        assertEquals(1, rollercoaster.getNumberOfRiders());
    }
    @Test
    public void cantAddShort(){
        rollercoaster.addCustomerToRide(customer1);
        assertEquals(0, rollercoaster.getNumberOfRiders());
    }

    @Test
    public void cantAddPoor(){
        rollercoaster.addCustomerToRide(customer3);
        assertEquals(0, rollercoaster.getNumberOfRiders());
    }

    @Test
    public void canStartRide(){
        assertEquals("Your favourite rollercoaster Megafobia is starting", rollercoaster.startRide());
    }

    @Test
    public void canRemoveRiders(){
        rollercoaster.addCustomerToRide(customer2);
        rollercoaster.addCustomerToRide(customer2);
        rollercoaster.addCustomerToRide(customer2);
        assertEquals(3, rollercoaster.getNumberOfRiders());
        rollercoaster.removeCustomers();
        assertEquals(0, rollercoaster.getNumberOfRiders());
    }
}
