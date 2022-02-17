import java.util.Scanner;

public class BarChart {

	public static int maxInArray(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void barChart(int[] arr) {
		int rows = maxInArray(arr);
		for (int i = rows; i >= 1; i--) {
			for (int j = 0; j < arr.length; j++) {
				if (i > arr[j])
					System.out.print("\t");
				else
					System.out.print("*\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();

		barChart(arr);
	}
}