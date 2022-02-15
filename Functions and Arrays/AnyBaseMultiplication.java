import java.util.*;

public class AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getProduct(b, n1, n2);
		System.out.println(d);
	}

	public static int singleDigitMultiplication(int n1, int d, int b) {
		int ans = 0, carry = 0, pwr = 1;
		while (n1 != 0 || carry != 0) {
			int mul = ((n1 % 10) * d) + carry;
			n1 /= 10;

			carry = mul / b;
			mul %= b;

			ans += mul * pwr;
			pwr *= 10;
		}
		return ans;
	}

	public static int anyBaseAddition(int n1, int n2, int b) {
		int ans = 0, carry = 0, pwr = 1;
		while (n1 != 0 || n2 != 0 || carry != 0) {
			int sum = n1 % 10 + n2 % 10 + carry;
			n1 /= 10;
			n2 /= 10;

			carry = sum / b;
			sum %= b;

			ans += sum * pwr;
			pwr *= 10;
		}
		return ans;
	}

	public static int getProduct(int b, int n1, int n2) {
		int ans = 0, pwr = 1;
		while (n2 != 0) {
			int lastDigit = n2 % 10;
			n2 /= 10;
			int product = singleDigitMultiplication(n1, lastDigit, b) * pwr;
			ans = anyBaseAddition(product, ans, b);
			pwr *= 10;
		}
		return ans;
	}
}