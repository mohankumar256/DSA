import java.util.*;

public class Pattern5 {
	public static void pattern(int n) {
		int nst = 1, nsp = n / 2;
		for (int r = 1; r <= n; r++) {
			for (int csp = 0; csp < nsp; csp++)
				System.out.print("\t");

			for (int cst = 0; cst < nst; cst++)
				System.out.print("*\t");
				
			if (r <= n / 2) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
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
