package decimal;

import java.util.Arrays;
import java.util.Scanner;

public class a2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] a = new int[num];
		int temp;
		
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();			
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[i + 1]) {
				temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;		
			}
		}
		for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		sc.close();

	}
}
