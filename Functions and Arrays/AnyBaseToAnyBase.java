import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static int getValueIndecimal(int n, int b) {
		int ans = 0, pwr = 1;
		while (n != 0) {
			int lastDigit = n % 10;
			n /= 10;
			ans += lastDigit * pwr;
			pwr *= b;
		}
		return ans;
	}

	public static int getValueInBase(int n, int b) {
		int res = 0, pwr = 1;
		while (n != 0) {
			int rem = n % b; // remainder
			n /= b; // dividing number by given base

			res += rem * pwr;

			pwr *= 10;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();
		int numberInDecimal = getValueIndecimal(n, sourceBase);
		int convertedNumber = getValueInBase(numberInDecimal, destBase);
		System.out.println(convertedNumber);
	}
}