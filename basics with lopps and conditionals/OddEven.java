import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println(" ");
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter a number to check it is even or not...");
			int i = scn.nextInt();
			if (i % 2 == 0) {
				System.out.println("It's a even number");

			} else {
				System.out.println("It's a odd number");
			}

		}
	}
}