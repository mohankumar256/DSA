import java.util.Scanner;

public class BrokenEconomy {

	public static void brokenEconomy(int[] a, int d) {
		int floor = -1;
		int ceil = -1;

		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (a[mid] == d) {
				ceil = floor = a[mid];
				break;
			} else if (a[mid] < d) {
				floor = a[mid];
				left = mid + 1;
			} else {
				ceil = a[mid];
				right = mid - 1;
			}
		}
		System.out.println(ceil);
		System.out.println(floor);
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		int d = scn.nextInt();
		brokenEconomy(a, d);
	}
}