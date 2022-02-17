import java.util.Scanner;

public class DifferenceOfTwoArrays {

	public static void differenceOfArray(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int borrow = 0;

		int[] ans = new int[j + 1];

		int k = ans.length - 1;

		while (j >= 0) {
			int diff = arr2[j] - borrow;

			if (i >= 0)
				diff -= arr1[i];

			if (diff < 0) {
				diff += 10;
				borrow = 1;
			} else
				borrow = 0;

			ans[k] = diff;

			i--;
			j--;
			k--;
		}
		
		int fzi = -1;
		for (int y = 0; y < ans.length; y++) {
			if (ans[y] != 0) {
				fzi = y;
				break;
			}
		}

		if (fzi == -1)
			System.out.println("0");

		for (int x = fzi; x < ans.length; x++)
			System.out.println(ans[x]);
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = new int[n];

		for (int i = 0; i < arr1.length; i++)
			arr1[i] = scn.nextInt();

		int m = scn.nextInt();
		int[] arr2 = new int[m];

		for (int i = 0; i < arr2.length; i++)
			arr2[i] = scn.nextInt();

		differenceOfArray(arr1, arr2);
	}
}