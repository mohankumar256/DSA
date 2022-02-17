import java.util.Scanner;

public class RotateNumber {
	public static int countDigits(int num) {
		int digits = 0;
		while (num != 0) {
			num /= 10;
			digits++;
		}
		return digits;
	}

	public static void rotateNumber(int num, int k) {
		int nod = countDigits(num); // no of digits

		k %= nod; // number of rotation (for rotation greater than nod)
		if (k < 0) // for negative rotations
			k += nod;

		int div = 1;
		int mul = 1;

		for (int i = 1; i <= nod; i++) {
			if (i <= k)
				div *= 10; // divisor
			else
				mul *= 10; // multiplier
		}

		int q = num / div; // quotient
		int r = num % div; // remainder

		int rotatedNumber = r * mul + q;
		System.out.println(rotatedNumber);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		rotateNumber(n, k);
	}

}
