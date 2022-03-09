import java.util.Scanner;

public class ToggleCase {

	public static String toggleCase(String str) {
		String toggle = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				char uc = (char) ('A' + ch - 'a');
				toggle += uc;
			} else if (ch >= 'A' && ch <= 'Z') {
				char lc = (char) ('a' + ch - 'A');
				toggle += lc;
			}
		}
		return toggle;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
}