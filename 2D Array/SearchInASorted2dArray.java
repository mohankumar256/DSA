import java.util.Scanner;

public class SearchInASorted2dArray {

	public static void search2D(int[][] arr, int x) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;

		while (i < n && j >= 0) {
			if (x == arr[i][j]) {
				System.out.println(i);
				System.out.println(j);
				return;
			} else if (x > arr[i][j])
				i++;
			else
				j--;
		}
		System.out.println("Not Found");
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = scn.nextInt();

		int x = scn.nextInt();

		search2D(arr, x);
	}

}