import java.util.Scanner;

public class Pattern6 {
	public static void pattern(int n) {
		int nst = (n + 1) / 2, nsp = 1;
		for (int r = 1; r <= n; r++) {
			for (int cst = 0; cst < nst; cst++)
				System.out.print("*\t");

			for (int csp = 0; csp < nsp; csp++)
				System.out.print("\t");

			for (int cst = 0; cst < nst; cst++)
				System.out.print("*\t");

			if (r <= n / 2) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;
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
