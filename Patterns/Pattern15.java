import java.util.Scanner;

public class Pattern15 {
	public static void pattern(int n) {
		int nst = 1, nsp = n / 2, count = 1;
		for (int r = 1; r <= n; r++) {
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("\t");

			int temp = count;
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(temp + "\t");
				if (cst <= nst / 2)
					temp++;
				else
					temp--;
			}

			if (r <= n / 2) {
				nsp--;
				nst += 2;
				count++;
			} else {
				nsp++;
				nst -= 2;
				count--;
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
