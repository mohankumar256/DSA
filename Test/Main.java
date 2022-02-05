import java.util.Scanner;

public class Main {

  public static void patternPrint(int rows) {

    for (int n = 0; n < rows; n++) {
      int val = 1;
      for (int r = 0; r <= n; r++) {
        System.out.print(val + "\t");
        val = ((n - r) * val) / (r + 1);

      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    patternPrint(scn.nextInt());
  }

}
