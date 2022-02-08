import java.util.*;

public class PatternM {
	public static void pattern(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (c == 1 || c == n)
					System.out.print("*\t");
				else if (r <= n / 2 + 1 && ((r == c) || (r + c == n + 1)))
					System.out.print("*\t");
				else
					System.out.print("\t");
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