package decimal;

import java.util.Scanner;

public class a8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int num = sc.nextInt();
		int score = 0;
		String[] a = new String[80];
		for (int i = 0; i < num; i++) {
			String str = sc.nextLine();
			a = str.split(str);
			System.out.println(a[i]);
		}
		
		sc.close();
		
	}
}
