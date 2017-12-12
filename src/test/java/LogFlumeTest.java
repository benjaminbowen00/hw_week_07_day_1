import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogFlumeTest {

    LogFlume logflume;

    @Before
    public void before(){
        logflume = new LogFlume("Splash Mountain", 10, 4.99, true);
    }

    @Test
    public void canGetName(){
        assertEquals("Splash Mountain", logflume.getName());
    }

    @Test
    public void canGetWaterRide(){
        assertEquals(true, logflume.isWaterRide());
    }

    @Test
    public void canGetRapids(){
        assertEquals(true, logflume.isRapids());
    }
}
