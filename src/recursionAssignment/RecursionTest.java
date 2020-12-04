package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertTrue(TESTBOOLEAN);
        assertEquals(2, Recursion.count7(7170));
    }

    @Test
    public void Test2(){
        // make assertion statement(s)
        // assertTrue(TESTBOOLEAN);
        assertEquals(1, Recursion.count7(70009));
    }
    
    // add more tests
}
