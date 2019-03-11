package decimal;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		String a;
		String[] a_split;
		int temp;

		num = sc.nextInt();
		a = sc.next();
		a_split = a.split("");

		for (int i = 0; i < num; i++) {
			temp = Integer.parseInt(a_split[i]);
			sum += temp; 
		}
		System.out.println(sum);
	}
}
