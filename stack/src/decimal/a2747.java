package decimal;

import java.util.Scanner;

public class a2747 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0, b = 1;
		if (n == 0) {
			System.out.println(a);
		} else if (n == 1) {
			System.out.println(b);
		}

		for (int i = 0; i < n - 1; i++) {
			if (b > a) {
				a = a + b;
			} else {
				b = b + a;
			}
		}
		if (b > a) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}

	}

}
