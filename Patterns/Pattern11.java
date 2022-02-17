import java.util.Scanner;

public class Pattern11 {
	public static void pattern(int n) {
		int nst = 1, count = 1;
		for (int r = 1; r <= n; r++) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(count + "\t");
				count++;
			}
			
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