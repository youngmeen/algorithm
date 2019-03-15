package decimal;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str_line = str.split(" ");

		int num = str_line.length;

		System.out.println(num);
		sc.close();
	}

}
