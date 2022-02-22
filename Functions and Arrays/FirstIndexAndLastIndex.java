import java.util.Scanner;

public class FirstIndexAndLastIndex {

	public static void firstAndLastIndex(int[] arr, int data) {
		int left = 0;
		int right = arr.length - 1;
		int fi = -1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (data > arr[mid]) {
				left = mid + 1;
			} else if (data < arr[mid]) {
				right = mid - 1;
			} else {
				right = mid - 1;
				fi = mid;
			}
		}
		System.out.println(fi);

		left = 0;
		right = arr.length - 1;
		int li = -1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (data > arr[mid]) {
				left = mid + 1;
			} else if (data < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
				li = mid;
			}
		}
		System.out.println(li);
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();

		int d = scn.nextInt();

		firstAndLastIndex(arr, d);
	}
}