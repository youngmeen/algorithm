package decimal;

import java.util.Scanner;

public class a5565 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pay = scan.nextInt();
		int sum = 0;
		int[] book = new int[9];
		for (int i = 0; i < book.length; i++) {
			book[i] += scan.nextInt();
			sum += book[i];
		}
		int result = pay - sum; 

		System.out.println(result);
		
		scan.close();
	}

}
