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

}
