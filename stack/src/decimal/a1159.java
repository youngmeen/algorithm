package decimal;

import java.util.Scanner;

public class a1159 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		scan.nextLine();

		String result = "";

		int[] arr = new int[30];

		for (int i = 0; i < num; i++) {
			String tmp = scan.nextLine();
			char a = tmp.charAt(0);
			arr[a - 97]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 5) {
				result += (char) (i + 97);
			}
		}

		if (result.equals("")) {
			System.out.println("PREDAJA");
		} else {
			System.out.println(result);
		}

	}

}
