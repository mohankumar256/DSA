import java.util.Scanner;

public class GcdLcm {
	public static int gcdCalculator(int num1, int num2) {
		while (num1 % num2 != 0) {
			int rem = num1 % num2; // remainder
			num1 = num2;
			num2 = rem;
		}
		return num2;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int gcd = gcdCalculator(num1, num2);
		int lcm = (num1 * num2) / gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}
}
