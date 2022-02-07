import java.util.*;

public class Pattern16 {

	public static void pattern(int n) {
		int nst = 1, nsp = 2 * n - 3;
		for (int r = 1; r <= n; r++) {
			int count = 1;
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(count + "\t");
				count++;
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			if (r == n) {
				nst--;
				count--;
			}
			for (int cst = 1; cst <= nst; cst++) {
				count--;
				System.out.print(count + "\t");

			}
			nst++;
			nsp -= 2;
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pattern(n);

	}
}