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
  * Computes 
  *
  * @param 
  * @return 
  */
  public static String pairStar(String str) {
    
    if (str.length() == 1 || str.equals("")) {
      return str;
    }

    if (str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    } else {
      return str.charAt(0) + pairStar(str.substring(1));
    }
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
