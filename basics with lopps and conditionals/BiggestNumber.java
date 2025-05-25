public class BiggestNumber {
	public static void main(String[] args) {
		System.out.println(" ");
		int a = 10;
		int b = 20;
		int c = 30;
		if (a > b) {
			if (a > c)
				System.out.println("Biggest number is:- " + a);
			else
				System.out.println("Biggest number is:- " + c);
		} else {
			if (b > c)
				System.out.println("Biggest number is:- " + b);
			else
				System.out.println("Biggest number is:- " + c);
		}
	}
}