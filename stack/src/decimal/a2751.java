package decimal;

import java.util.Arrays;
import java.util.Scanner;

public class a2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		sc.close();

	}
}
