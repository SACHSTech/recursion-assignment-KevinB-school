package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * An initial test
     */
    //Problem Set 1
    @Test
    public void Test1(){
      //testing base case (PS1 Method Count7)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(2, Recursion.count7(717));
    }

    //Problem Set 1
    @Test
    public void Test2(){
      // testing return function (PS1 Method Count7)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(1, Recursion.count7(70009));
    }
    
    //Problem Set 1
    @Test
    public void Test3(){
      // testing 0 return (PS1 Method Count7)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(0, Recursion.count7(1092834));
    }

    //Problem Set 2
    @Test
    public void Test4(){
      // testing simple base case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals("rex", Recursion.endX("xre"));
    }

    //Problem Set 2
    @Test
    public void Test5(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      //assertEquals("hel*lo", Recursion.endX("hello"));
    }

    //Problem Set 2
    @Test
    public void Test6(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      //assertEquals("x*xy*y", Recursion.endX("xxyy"));
    }

    //Problem Set 2
    @Test
    public void Test7(){
      // testing recursive case return (PS2 Method pairStar)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      //assertEquals("a*a*a*a", Recursion.endX("aaaa"));
    }

    //Problem Set 3
    @Test 
    public void Test8(){
      // testing recursive case return (PS3 Method array220)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(false, Recursion.array220(new int[] {3}, 0));
    }

    //Problem Set 3
    @Test 
    public void Test9(){
      // testing recursive case return (PS3 Method array220)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(true, Recursion.array220(new int[] {3, 30}, 0));
    }

    //Problem Set 3
    @Test 
    public void Test10(){
      // testing recursive case return (PS3 Method array220)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(true, Recursion.array220(new int[] {1, 2, 20}, 0));
    }

    //Problem Set 3
    @Test 
    public void Test11(){
      // testing recursive case return (PS3 Method array220)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(false, Recursion.array220(new int[] {1, 2, 3, 4}, 1));
    }

    //Problem Set 3
    @Test 
    public void Test12(){
      // testing recursive case return (PS3 Method array220)
      // make assertion statement(s)
      // assertTrue(TESTBOOLEAN);
      assertEquals(false, Recursion.array220(new int[] {20, 30, 4, 8}, 2));
    }

}
