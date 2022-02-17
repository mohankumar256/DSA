import java.util.Scanner;

public class Pattern1 {
	public static void pattern(int n) {
		int nst = 1; // nst=number of stars
		for (int r = 1; r <= n; r++) {
			for (int cst = 0; cst < nst; cst++) 
				System.out.print("*\t"); //count of stars

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
