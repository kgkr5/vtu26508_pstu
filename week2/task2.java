import java.util.*;

public class task2 {
  interface PerformOperation {
    boolean check(int a);
  }

  public static PerformOperation isOdd() {
    return i -> i % 2 != 0;
  }

  public static PerformOperation isPrime() {
    return i -> {
      if (i == 2) return true;
      if (i <= 1 || i % 2 == 0) return false;
      int numberSqrt = (int) Math.sqrt(i);
      for (int j = 3; j <= numberSqrt; j += 2) {
        if (i % j == 0) return false;
      }
      return true;
    };
  }

  public static PerformOperation isPalindrome() {
    return i -> {
      String numberStr = String.valueOf(i);
      String reversedStr = new StringBuilder(numberStr).reverse().toString();
      return numberStr.equals(reversedStr);
    };
  }

  public static String check(PerformOperation p, int num, int type) {
    boolean result = p.check(num);
    if (type == 1) return result ? "ODD" : "EVEN";
    if (type == 2) return result ? "PRIME" : "COMPOSITE";
    return result ? "PALINDROME" : "NOT PALINDROME";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int ch = sc.nextInt();
      int num = sc.nextInt();
      if (ch == 1) System.out.println(check(isOdd(), num, 1));
      else if (ch == 2) System.out.println(check(isPrime(), num, 2));
      else if (ch == 3) System.out.println(check(isPalindrome(), num, 3));
    }
    sc.close();
  }
}