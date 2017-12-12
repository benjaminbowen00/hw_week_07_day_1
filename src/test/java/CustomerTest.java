import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Jane", 11, 1.60, 4.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Jane", customer.getName());
    }

    @Test
    public void canGetHeight(){
        assertEquals(1.60, customer.getHeight(), 0.01);
    }


}
