import java.util.Scanner;

public class SpiralDisplay {

	public static void spiralDisplay(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;

		int total = n * m;
		int count = 0;

		int minr = 0;
		int maxr = n - 1;
		int minc = 0;
		int maxc = m - 1;

		while (count < total) {
			for (int i = minr; i <= maxr && count < total; i++) {
				System.out.println(arr[i][minc]);
				count++;
			}
			minc++;

			for (int i = minc; i <= maxc && count < total; i++) {
				System.out.println(arr[maxr][i]);
				count++;
			}
			maxr--;

			for (int i = maxr; i >= minr && count < total; i--) {
				System.out.println(arr[i][maxc]);
				count++;
			}
			maxc--;

			for (int i = maxc; i >= minc && count < total; i--) {
				System.out.println(arr[minr][i]);
				count++;
			}
			minr++;
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				arr[i][j] = scn.nextInt();
		spiralDisplay(arr);
	}
}