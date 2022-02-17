import java.util.Scanner;

public class SumOfTwoArrays {

	public static void sumOfArray(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;

		int size = (i > j) ? i + 1 : j + 1;
		int[] ans = new int[size];

		int k = ans.length - 1;

		while (k >= 0) {
			int sum = 0;
			sum += carry;

			if (i >= 0)
				sum += arr1[i];

			if (j >= 0)
				sum += arr2[j];

			ans[k] = sum % 10;
			carry = sum / 10;

			i--;
			j--;
			k--;
		}
		if (carry != 0)
			System.out.println(carry);

		for (int x = 0; x < ans.length; x++)
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

		sumOfArray(arr1, arr2);
	}
}