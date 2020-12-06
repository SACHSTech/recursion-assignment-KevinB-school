package recursionAssignment;

public class Recursion{


  /**
  * Computes how many times the digit 7 is in the number given
  *
  * @param n  The number given
  * @return The number of times the digit seven appears in the number
  */
  public static int count7(int n) {
    int numbOfSeven = 0;

    if ((n % 10) == 7) {
      numbOfSeven += 1;
    } else if (n / 10 == 0) {
      return numbOfSeven;
    }

    return numbOfSeven + count7(n / 10);
  }



  /**
  * Computes a string where all the x's in it get moved to the end of the string
  *
  * @param str  The given string
  * @return String that is the str inputed but it has all the x's at the end
  */
  public static String endX(String str) {
    if ((str.substring(0, 1)).equals("x")) {
      return endX(str.substring(1)) + "x";
    } else if ((!(str.substring(0, 1)).equals("x")) && (str.length() > 3)) {
      return str.substring(0, 1) + endX(str.substring(1));
    }

    return str;
  }



  /**
  * Computes if a number in the array given is followed by itself times 10
  *
  * @param intNums  The array of numbers
  * @param index  The index number to start at in the array
  * @return Boolean of weather or not a number in the array is followed by a number 10 times itself or not
  */
  public static boolean array220(int[] intNums, int index) {
    if ((intNums.length - index) <= 1) {
      return false;
    }  
    
    if (intNums[index] * 10 == intNums[index + 1]){
      return true;
    } else if (intNums.length > index){
      index += 1;
      return array220(intNums, index);
    } else {
      return false;
    }
  }


}
