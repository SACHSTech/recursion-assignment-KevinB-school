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

    @Test
    public void Test6(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals("x*xy*y", Recursion.pairStar("xxyy"));
    }

    @Test
    public void Test7(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));
    }

    @Test 
    public void Test8(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(false, Recursion.array220(new int[] {3}, 0));
    }

    @Test 
    public void Test9(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(true, Recursion.array220(new int[] {3, 30}, 0));
    }

    @Test 
    public void Test10(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(true, Recursion.array220(new int[] {1, 2, 20}, 0));
    }

    @Test 
    public void Test11(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(false, Recursion.array220(new int[] {1, 2, 3, 4}, 1));
    }

    @Test 
    public void Test12(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(false, Recursion.array220(new int[] {20, 30, 4, 8}, 2));
    }

    // add more tests
}
