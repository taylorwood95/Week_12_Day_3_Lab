
import TechStaff.Developer;
import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Angela", 5555, 10000, 10000);
    }

    @Test
    public void canGetBudget() {
        assertEquals(10000, director.getBudget());

    }

    @Test
    public void canPayBonus(){
        assertEquals(200, director.payBonus());
    }

    @Test
    public void getName(){
        assertEquals("Angela", director.getName());
    }
}
