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
      //testing base case (PS1 Method Count7)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(2, Recursion.count7(717));
    }

    @Test
    public void Test2(){
      // testing return function (PS1 Method Count7)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(1, Recursion.count7(70009));
    }
    
    @Test
    public void Test3(){
      // testing 0 return (PS1 Method Count7)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(0, Recursion.count7(1092834));
    }

    @Test
    public void Test4(){
      // testing simple base case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals("l*l", Recursion.pairStar("ll"));
    }

    @Test
    public void Test5(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals("hel*lo", Recursion.pairStar("hello"));
    }

    // add more tests
}
