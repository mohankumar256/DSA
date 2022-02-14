import java.util.*;

public class AnyBaseSubtraction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getDifference(b, n1, n2);
		System.out.println(d);
	}

	public static int getDifference(int b, int n1, int n2) {
		int ans = 0, pwr = 1, carry = 0;
		while (n2 != 0) {
			int diff = n2 % 10 - n1 % 10 - carry;
			n2 /= 10;
			n1 /= 10;

			if (diff < 0) {
				carry = 1;
				diff += b;
			} else {
				carry = 0;
			}

			ans += diff * pwr;
			pwr *= 10;

		}
		return ans;
	}

}