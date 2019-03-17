package decimal;

import java.util.Scanner;

public class a10797 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] car = new int[5];
		
		int cnt = 0;
		
		for (int i = 0; i < car.length; i++) {
			car[i] = scan.nextInt();
			if(car[i] == num) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		scan.close();
	}

}
