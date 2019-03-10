package decimal;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		int[] count = new int[10];
		String input = String.valueOf(a * b * c);
		// 숫자를 String으로 변환시켜주는 함수

		for (int i = 0; i < input.length(); i++) {
			count[input.charAt(i) - '0']++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
