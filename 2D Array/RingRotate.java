import java.util.Scanner;

public class RingRotate {

	public static int[] fillOnedFromShell(int[][] arr, int s) {
		int n = arr.length;
		int m = arr[0].length;

		int minr = s - 1;
		int maxr = n - s;
		int minc = s - 1;
		int maxc = m - s;

		int size = 2 * (maxr - minr + maxc - minc);

		int[] oned = new int[size];
		int idx = 0;

		for (int i = minr; i <= maxr; i++) {
			oned[idx] = arr[i][minc];
			idx++;
		}
		minc++;
		for (int j = minc; j <= maxc; j++) {
			oned[idx] = arr[maxr][j];
			idx++;
		}
		maxr--;
		for (int i = maxr; i >= minr; i--) {
			oned[idx] = arr[i][maxc];
			idx++;
		}
		maxc--;
		for (int j = maxc; j >= minc; j--) {
			oned[idx] = arr[minr][j];
			idx++;
		}
		minr++;

		return oned;

	}

	public static void swap(int[] a, int i, int j) {
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void reverse(int[] a, int i, int j) {
		while (i < j) {
			swap(a, i, j);
			i++;
			j--;
		}
	}

	public static void rotate(int[] oned, int r) {
		r %= oned.length;
		if (r < 0)
			r += oned.length;
		int n = oned.length;
		reverse(oned, 0, n - r - 1);
		reverse(oned, n - r, n - 1);
		reverse(oned, 0, n - 1);
	}

	public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
		int n = arr.length;
		int m = arr[0].length;

		int minr = s - 1;
		int maxr = n - s;
		int minc = s - 1;
		int maxc = m - s;

		int idx = 0;

		for (int i = minr; i <= maxr; i++) {
			arr[i][minc] = oned[idx];
			idx++;
		}
		minc++;
		for (int j = minc; j <= maxc; j++) {
			arr[maxr][j] = oned[idx];
			idx++;
		}
		maxr--;
		for (int i = maxr; i >= minr; i--) {
			arr[i][maxc] = oned[idx];
			idx++;
		}
		maxc--;
		for (int j = maxc; j >= minc; j--) {
			arr[minr][j] = oned[idx];
			idx++;
		}
		minr++;
	}

	public static void ringRotate(int[][] arr, int s, int r) {
		int[] oned = fillOnedFromShell(arr, s);
		rotate(oned, r);
		fillShellFromOned(arr, s, oned);
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				arr[i][j] = scn.nextInt();

		int s = scn.nextInt();
		int r = scn.nextInt();

		ringRotate(arr, s, r);
		display(arr);
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}