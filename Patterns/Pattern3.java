import java.util.Scanner;

public class Pattern3 {
	public static void pattern(int n) {
		int nst = 1, nsp = n - 1; // nst = no. of stars, nsp = no. of spaces
		for (int r = 1; r <= n; r++) {
			for (int csp = 0; csp < nsp; csp++) // csp = count of space
				System.out.print("\t");

			for (int cst = 0; cst < nst; cst++) // cst = count of stars
				System.out.print("*\t");

			nsp--;
			nst++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pattern(n);
	}
}
