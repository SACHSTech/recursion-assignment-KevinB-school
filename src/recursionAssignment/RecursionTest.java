package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * Add a brief java doc for each**
     */
    //Problem Set 1
    @Test
    public void Test1(){
      assertEquals(2, Recursion.count7(717));
    }

    //Problem Set 1
    @Test
    public void Test2(){
      assertEquals(1, Recursion.count7(70009));
    }
    
    //Problem Set 1
    @Test
    public void Test3(){
      assertEquals(0, Recursion.count7(1092834));
    }

    //Problem Set 2
    @Test
    public void Test4(){
      assertEquals("rex", Recursion.endX("xre"));
    }

    //Problem Set 2
    @Test
    public void Test5(){
      assertEquals("rexx", Recursion.endX("xxre"));
    }

    //Problem Set 2
    @Test
    public void Test6(){
      assertEquals("hihixxx", Recursion.endX("xhixhix"));
    }

    //Problem Set 2
    @Test
    public void Test7(){
      assertEquals("hixxxx", Recursion.endX("xxhixx"));
    }

    //Problem Set 3
    @Test 
    public void Test8(){
      assertEquals(false, Recursion.array220(new int[] {3}, 0));
    }

    //Problem Set 3
    @Test 
    public void Test9(){
      assertEquals(true, Recursion.array220(new int[] {3, 30}, 0));
    }

    //Problem Set 3
    @Test 
    public void Test10(){
      assertEquals(true, Recursion.array220(new int[] {1, 2, 20}, 0));
    }

    //Problem Set 3
    @Test 
    public void Test11(){
      assertEquals(false, Recursion.array220(new int[] {1, 2, 3, 4}, 1));
    }

    //Problem Set 3
    @Test 
    public void Test12(){
      assertEquals(false, Recursion.array220(new int[] {20, 30, 4, 8}, 2));
    }

}
