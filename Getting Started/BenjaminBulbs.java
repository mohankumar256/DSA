import java.util.Scanner;

public class BenjaminBulbs {
	public static void benjaminBulbs(int num) {
		for (int i = 1; i * i <= num; i++)
			System.out.println(i * i); // print perfect squares
	} // On all odd fluctuation bulb glows

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		benjaminBulbs(num);
	}
}
