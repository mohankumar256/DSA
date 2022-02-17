import java.util.Scanner;

public class PrintFibonacci {
	public static void printFibonacci(int n) {
		int a = 0, b = 1, c;
		for (int i = 0; i < n; i++) {
			System.out.println(a); // first we print a=0
			c = a + b;
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printFibonacci(n);
	}
}
