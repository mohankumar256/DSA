import java.util.*;

public class Pattern18 {
	public static void pattern(int n) {
		int nst = n, nsp = 0;
		for (int r = 1; r <= n; r++) {
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("\t");

			for (int cst = 1; cst <= nst; cst++) {
				if (r > 1 && r <= n / 2 && cst > 1 && cst < nst)
					System.out.print("\t");
				else
					System.out.print("*\t");
			}

			if (r <= n / 2) {
				nst -= 2;
				nsp++;
			} else {
				nst += 2;
				nsp--;
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