import java.util.*;

public class Pattern9_2 {
	public static void pattern(int n) {
		int nsp1 = 0, nsp2 = n - 2;
		for (int r = 1; r <= n; r++) {
			for (int csp1 = 1; csp1 <= nsp1; csp1++)
				System.out.print("\t");

			System.out.print("*\t");

			for (int csp2 = 1; csp2 <= nsp2; csp2++)
				System.out.print("\t");

			if (r != n / 2 + 1)
				System.out.print("*\t");

			if (r <= n / 2) {
				nsp1++;
				nsp2 -= 2;
			} else {
				nsp1--;
				nsp2 += 2;
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