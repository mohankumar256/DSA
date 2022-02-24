import java.util.Scanner;

public class MatrixMultiplication {

	public static Scanner scn = new Scanner(System.in);

	public static int[][] input(int n, int m) {
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				arr[i][j] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {

		int n1 = scn.nextInt();
		int m1 = scn.nextInt();
		int[][] arr1 = new int[n1][m1];

		arr1 = input(n1, m1);

		int n2 = scn.nextInt();
		int m2 = scn.nextInt();
		int[][] arr2 = new int[n2][m2];

		arr2 = input(n2, m2);

		if (m1 != n2) {
			System.out.println("Invalid input");
			return;
		}

		int[][] ans = new int[n1][m2];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < m2; j++) {
				int sum = 0;
				for (int k = 0; k < m1; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
				ans[i][j] = sum;
			}
		}

		display(ans);
	}

}