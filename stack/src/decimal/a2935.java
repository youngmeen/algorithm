package decimal;

import java.math.BigInteger;
import java.util.Scanner;

public class a2935 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger n = new BigInteger(scan.nextLine());
		char c = scan.nextLine().charAt(0);
		BigInteger m = new BigInteger(scan.nextLine());
		int sum = 0;

		if (c == '*') {
			System.out.println(n.multiply(m));
		}else {
			System.out.println(n.add(m));
		}

		scan.close();
	}

}
