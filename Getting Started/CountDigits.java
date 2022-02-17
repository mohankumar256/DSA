import java.util.Scanner;

public class CountDigits {
	public static void countDigit(int num) {
		int digit = 0;
		while (num != 0) {
			num /= 10; // dividing the num by 10 removes last digits
			digit++;
		}
		System.out.print(digit);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		countDigit(num);
	}
}
