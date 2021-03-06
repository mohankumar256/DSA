import java.util.Scanner;

public class Pattern17 {
	public static void pattern(int n) {
		int nst = 1, nsp = n / 2;
		for (int r = 1; r <= n; r++) {
			for (int csp = 1; csp <= nsp; csp++)
				if (r == n / 2 + 1)
					System.out.print("*\t");
				else
					System.out.print("\t");

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}

			if (r <= n / 2) {
				nst++;
			} else {
				nst--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pattern(n);
	}
}