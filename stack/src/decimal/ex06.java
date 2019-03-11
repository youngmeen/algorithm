package decimal;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		int num = str.length() / 10;

		for (int i = 0; i < num + 1; i++) {
			if (i >= num) {
				System.out.println(str.substring(10 * i));
				break;
			}
			System.out.println(str.substring(0 + (10 * i), 10 + (10 * i)));

		}

	}
}
