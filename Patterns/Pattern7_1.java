import java.util.Scanner;

public class Pattern7_1 {
	public static void pattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == col)
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
