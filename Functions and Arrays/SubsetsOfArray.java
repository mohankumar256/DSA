import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubsetsOfArray {

	public static int decimalToBinary(int n) {
		int res = 0, pwr = 1;
		while (n != 0) {
			int rem = n % 2;
			n /= 2;
			res += rem * pwr;
			pwr *= 10;
		}
		return res;
	}

	public static void subsetOfArray(int[] a, int n) {
		int totalSubsets = (int) Math.pow(2, n);
		for (int i = 0; i < totalSubsets; i++) {
			int binary = decimalToBinary(i);
			int div = (int) Math.pow(10, n - 1);

			for (int j = 0; j < n; j++) {
				int q = binary / div;
				binary %= div;

				if (q == 0)
					System.out.print("-\t");
				else
					System.out.print(a[j] + "\t");

				div /= 10;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		subsetOfArray(a, n);
	}
}