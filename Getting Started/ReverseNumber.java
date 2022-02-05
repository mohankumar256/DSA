import java.util.*;

public class ReverseNumber {
	public static void reverseNumber(int num) {
		while (num != 0) {
			int lastDigit = num % 10; // to get the last digit of number
			num /= 10; // to remove the last digit from number
			System.out.println(lastDigit);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		reverseNumber(num);
	}

}
