package decimal;

import java.util.Scanner;

public class a1978 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		Boolean b = true;
		int count = 0;

		for (int i = 0; i < num; i++) {
			int pNum = scan.nextInt();

			if (pNum <= 1) {
				b = false;
			} else {
				for (int j = 0; j <= pNum / 2; j++) {
					if (pNum % j == 0) {
						b = false;
					}
				}
			}

			if (b)
				count++;
			b = true;
		}

		System.out.println(count);
		scan.close();

	}

}
