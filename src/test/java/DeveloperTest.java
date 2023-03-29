import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Randolph", 54321, 50000);
    }


    @Test
    public void canGetName(){
        assertEquals("Randolph", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals(54321, developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, developer.getSalary());
    }

    @Test
    public void canCarryOutRaise(){
        developer.raiseSalary(1000);
        assertEquals(51000, developer.getSalary());
    }
    @Test
    public void canPayBonus(){
        assertEquals(500, developer.payBonus());
    }
}
