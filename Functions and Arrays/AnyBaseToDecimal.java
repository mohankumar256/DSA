import java.util.*;

public class AnyBaseToDecimal {

   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }

   public static int getValueIndecimal(int n, int b) {
      int ans = 0, pwr = 1;
      while (n != 0) {
         int lastDigit = n % 10;
         n /= 10;
         ans += lastDigit * pwr;
         pwr *= b;
      }
      return ans;
   }
}