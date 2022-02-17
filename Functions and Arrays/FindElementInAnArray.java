import java.util.Scanner;

public class FindElementInAnArray {

	public static int searchElement(int[] arr, int d) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == d)
				return i;

		return -1;
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();

		int d = scn.nextInt();

		System.out.println(searchElement(arr, d));
	}
}