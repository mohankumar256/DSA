import java.util.Scanner;

public class FirstIndex {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();

		int x = scn.nextInt();

		int index = firstIndex(arr, 0, x);

		System.out.println(index);
	}

	public static int firstIndex(int[] arr, int idx, int x) {
		if (idx == arr.length)
			return -1;

		if (arr[idx] == x) {
			return idx;
		} else {
			int fiisa = firstIndex(arr, idx + 1, x);
			return fiisa;
		}
	}
}