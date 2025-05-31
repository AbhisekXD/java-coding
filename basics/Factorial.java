import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(" ");
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter a number to find it's factorial");
			long x = 1;
			long n = scn.nextInt();
			for (int i = 1; i <= n; i++) {
				x = x * i;
			}
			System.out.println("Factorial:- " + x);
			System.out.println(" ");
		}
	}
}