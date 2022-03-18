import java.util.Scanner;

public class Powerlinear {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);

		int x = scn.nextInt();
		int n = scn.nextInt();

		int ans = power(x, n);
		System.out.println(ans);
	}

	public static int power(int x, int n) {

		if (n == 0)
			return 1;

		int ans = x * power(x, n - 1);

		return ans;
	}
}