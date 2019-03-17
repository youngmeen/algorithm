package decimal;

import java.util.Scanner;

public class a2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int temp = 0;
		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}
