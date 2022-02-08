import java.util.*;

public class Pattern19 {
	public static void pattern(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r == 1 && c > n / 2 + 1 && c < n) // first row
					System.out.print("\t");
				else if (r > 1 && r <= n / 2 && ((c <= n / 2) || (c > n / 2 + 1 && c < n)))
					System.out.print("\t"); // after 1st row & before mid row
				else if (r > n / 2 + 1 && r < n && ((c > 1 && c <= n / 2) || (c > n / 2 + 1)))
					System.out.print("\t"); // after mid row & before last row
				else if (r == n && (c > 1 && c <= n / 2))
					System.out.print("\t"); // last row
				else
					System.out.print("*\t");
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