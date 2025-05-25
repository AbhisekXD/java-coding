import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println(" ");
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter a year to check wheather it's a leap year or not");
			int y = scn.nextInt();
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
				System.out.println("It's a leap year..");
			} else {
				System.out.println("It's not a leap year..");
			}
			System.out.println(" ");
		}
	}
}