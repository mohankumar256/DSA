import java.util.Scanner;

public class Pattern12 {
	public static void pattern(int n) {
		int nst = 1, a = 0, b = 1, sum = 0;
		for (int r = 1; r <= n; r++) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(a + "\t");
				sum = a + b;
				a = b;
				b = sum;
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