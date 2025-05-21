import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(" ");
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter a number to check wheather it's prime or not");
			int n = scn.nextInt();
			int j = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					j++;
				}
			}
			if (j == 1) {
				System.out.println("It's a special number..");
			}
			else if (j == 2) {
				System.out.println("It's a prime number..");
			} else {
				System.out.println("It's not a prime number..");
			}
			System.out.println(" ");
		}
	}
}