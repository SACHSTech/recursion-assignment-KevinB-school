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
    String strFinal = "";
    if (str.substring(0, 1).equals(str.substring(1, 2))){
      strFinal = str.substring(0, 1) + "*" + str.substring(1, 2);
    } 

    return strFinal;
  }
}
