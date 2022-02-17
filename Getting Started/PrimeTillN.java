import java.util.Scanner;

public class PrimeTillN {
	public static boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int lo = scn.nextInt();
		int hi = scn.nextInt();

		for (int i = lo; i <= hi; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}

}
