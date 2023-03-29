import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Taylor", 12345, 30000, "Codeclan");
    }

    @Test
    public void canGetDept(){
        assertEquals("Codeclan", manager.getDeptName());
    }

    @Test
    public void canGetName(){
        assertEquals("Taylor", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals(12345, manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canCarryOutRaise(){
        manager.raiseSalary(1000);
        assertEquals(31000, manager.getSalary());
    }
    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus());
    }
}
