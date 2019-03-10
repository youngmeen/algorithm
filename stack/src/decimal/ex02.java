package decimal;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int count = 0;
		while (x > 1) {
			
			if (x % 3 == 0) {
				x /= 3;
				count++;
			} else if (x % 2 == 0) {
				x /= 2;
				count++;
			} else {
				x--;
				count++;
			}
		}
		System.out.println(count);
		

	}

}
