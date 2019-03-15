package decimal;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();

		int[] min = new int[1000001];

		min[1] = 0;

		for (int i = 2; i < X + 1; i++) {
			min[i] = min[i - 1] + 1;
		}

		scan.close();
	}
}
