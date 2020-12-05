package recursionAssignment;

public class Recursion{

  public static int count7(int n) {
    int numbOfSeven = 0;

    if ((n % 10) == 7) {
      numbOfSeven += 1;
    } else if (n / 10 == 0) {
      return numbOfSeven;
    }

    return numbOfSeven + count7(n / 10);
  }

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

  public static boolean array220(int[] intNums, int index) {
    if (intNums.length == 1) {
      return false;
    } else {
      return true;
    }
  }
}
