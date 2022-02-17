import java.util.Scanner;

public class PrimeFactorization {
	public static void primeFactorization(int num) {
		for (int div = 2; div * div <= num; div++) {
			while (num % div == 0) {
				num /= div; // divide number till it can be
				System.out.print(div + " ");
			}
		}
		if (num != 1) // if number not gets divided then print it
			System.out.print(num);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		primeFactorization(num);
	}
}
