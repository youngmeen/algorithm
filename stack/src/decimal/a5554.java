package decimal;

import java.util.Scanner;

public class a5554 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		
		int[] sec = new int[4];
		
		for (int i = 0; i < sec.length; i++) {
			sec[i] = scan.nextInt();
			sum += sec[i];
		}
		
		int min = sum / 60;
		int sec_1 = sum % 60;
		
		System.out.println(min);
		System.out.println(sec_1);
	}

}
