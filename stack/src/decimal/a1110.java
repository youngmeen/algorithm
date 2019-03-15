package decimal;

import java.util.Scanner;

public class a1110 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		scan.close();

		int n = num;

		while (true) {

			num = (num % 10 * 10) + ((num / 10 + num % 10) % 10);

			count++;

			if (n == num) {
				break;
			}
		}
		System.out.println(count);
	}
}
