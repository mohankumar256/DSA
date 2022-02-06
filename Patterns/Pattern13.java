import java.util.*;

public class Pattern13 {
	public static void pattern(int n) {
		for (int r = 0; r < n; r++) {
			int val = 1;
			for (int c = 0; c <= r; c++) {
				System.out.print(val + "\t");
				val = ((val * (r - c)) / (c + 1));
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