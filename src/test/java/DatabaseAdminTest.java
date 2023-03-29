import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Graeme", 98765, 20000);
    }

    @Test
    public void canGetName(){
        assertEquals("Graeme", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals(98765, databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000, databaseAdmin.getSalary());
    }

    @Test
    public void canCarryOutRaise(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(21000, databaseAdmin.getSalary());
    }
    @Test
    public void canPayBonus(){
        assertEquals(200, databaseAdmin.payBonus());
    }
}
