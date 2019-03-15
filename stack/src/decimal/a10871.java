package decimal;

import java.util.Scanner;

public class a10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();

		int[] A = new int[n];

		for (int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] < x) {
				System.out.print(A[i] + " ");
			}
		}
		scan.close();

	}

}
