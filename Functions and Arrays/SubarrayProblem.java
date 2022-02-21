import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubarrayProblem {

	public static void subarray(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int start = i; start < n; start++) {
				for (int end = i; end <= start; end++) {
					System.out.print(a[end] + "\t");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		subarray(a);
	}
}