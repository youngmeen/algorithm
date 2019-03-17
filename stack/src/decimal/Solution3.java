package decimal;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		int count = 0;
		String[] a = new String[100000];

		for (int i = 0; i < args.length; i++) {
			int index = input.charAt(i);
			if (index >= 0 && index <= 9) {
				break;
			}
			count++;
		}
		String str = input.substring(0, count);
		String str_two = input.substring(count, input.length());
		count = 0;

		for (int i = 0; i < str.length(); i++) {

			int index1 = input.charAt(i + 1);
			if (index1 >= 'a' && index1 <= 'z') {
				a[count] = str.substring(i, i + 1);
				i++;
			} else {
				a[count] = str.substring(i, i);
			}
			count++;
		}

		scan.close();

	}

}
