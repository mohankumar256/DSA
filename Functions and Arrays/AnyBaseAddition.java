import java.util.Scanner;

public class AnyBaseAddition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getSum(b, n1, n2);
		System.out.println(d);
	}

	public static int getSum(int b, int n1, int n2) {
		int carry = 0, ans = 0, pwr = 1;
		while (n1 != 0 || n2 != 0 || carry != 0) {
			int sum = n1 % 10 + n2 % 10 + carry; //sum calculation

			n1 /= 10;
			n2 /= 10;

			carry = sum / b;
			sum %= b;

			ans += sum * pwr;
			pwr *= 10;
		}
		return ans;
	}
}