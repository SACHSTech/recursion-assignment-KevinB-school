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

      if ((str.length() >= 2) && (str.substring(0, 1).equals(str.substring(1, 2)))){
        strFinal = str.substring(0, 1) + "*" + str.substring(1, 2);
        str = str.substring(2, str.length());
        if (str.length() > 0) {
          return strFinal + pairStar(str);
        } else {
          return strFinal;
        }
      } else if (str.length() != 0) {
        if (str.length() == 1) {
          strFinal = str.substring(0, 1);
          return strFinal;
        } else {
          strFinal = str.substring(0, 1);
          str = str.substring(1, str.length());
          return strFinal + pairStar(str);
        }
      }

      return strFinal + pairStar(str);
  }
}
