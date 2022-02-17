import java.util.Scanner;

public class PythagoreanTriplet {
	public static void pythagoreanTriplet(int a, int b, int c) {
		int max = a; // let a be the max number
		if ((b > max) || (c > max)) {
			if (b > c)
				max = b;
			else
				max = c;
		}
		if (max == a) {
			boolean flag = ((b * b + c * c) == (a * a));
			System.out.println(flag);
		}
		if (max == b) {
			boolean flag = ((a * a + c * c) == (b * b));
			System.out.println(flag);
		}
		if (max == c) {
			boolean flag = ((b * b + a * a) == (c * c));
			System.out.println(flag);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		pythagoreanTriplet(a, b, c);
	}

}
