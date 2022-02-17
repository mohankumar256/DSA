import java.util.Scanner;

public class InverseNumber {
	public static void inverseOfNumber(int num) {
		int lastIndex = 1, result = 0, lastDigit = 0;
		while (num != 0) {
			lastDigit = num % 10; // obtaining last digit of the number
			num /= 10; // removing last digit from number
			result += lastIndex * (int) Math.pow(10, lastDigit - 1); // result
			lastIndex++;
		}
		System.out.print(result);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		inverseOfNumber(scn.nextInt());
	}

}
