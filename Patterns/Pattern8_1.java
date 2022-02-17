import java.util.Scanner;

public class Pattern8_1 {
	public static void pattern(int n) {
		int nsp = n - 1;
		for (int r = 1; r <= n; r++) {
			for (int csp = 0; csp < nsp; csp++) {
				System.out.print("\t");
			}

			System.out.print("*\t");

			nsp--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pattern(n);
	}
}
