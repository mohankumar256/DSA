import java.util.Scanner;

public class PrintDigits {
	public static int countDigit(int num) {
		int digit = 0;
		while (num != 0) {
			num /= 10; // dividing the num by 10 removes last digits
			digit++;
		}
		return digit;
	}

	public static void digitsOfNumber(int num) {
		int len = countDigit(num) - 1;
		int digit = 0, pwr = 0;
		while (len >= 0) {
			pwr = (int) Math.pow(10, len); // calculation of power - 10^len
			digit = num / pwr; // dividing by 10^len gives first digit
			num %= pwr; // removing the first digit from number
			System.out.println(digit);
			len--;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		digitsOfNumber(scn.nextInt());
	}

}
