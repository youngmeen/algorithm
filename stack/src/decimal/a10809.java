package decimal;

import java.util.Scanner;

public class a10809 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] sp_str = new String[str.length()];
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		int[] temp = new int[26];

		scan.close();

		for (int j = 0; j < str.length(); j++) {

			sp_str[j] = str.substring(j, j + 1);
		}

		for (int i = 0; i < temp.length; i++) {
			temp[i] = -1;
		}

		for (int i = 0; i < sp_str.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {			
				if (sp_str[i].equals(alphabet[j]) && temp[j] == -1) {
					temp[j] = i;
				}
			}
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
