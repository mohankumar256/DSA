import java.util.Scanner;

public class MaxOfAnArray {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();

		int max = maxOfArray(arr, 0);

		System.out.println(max);
	}

	public static int maxOfArray(int[] arr, int idx) {
		if (idx == arr.length)
			return Integer.MIN_VALUE;

		int f1 = maxOfArray(arr, idx + 1);
		int max = Math.max(f1, arr[idx]);
		return max;
	}
}