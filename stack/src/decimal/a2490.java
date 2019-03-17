package decimal;

import java.util.Scanner;

public class a2490 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[4];
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i] = scan.nextInt();
				sum += arr[i];				
			}						
			if (sum == 3) {
				System.out.println("A");
			} else if (sum == 2) {
				System.out.println("B");
			} else if (sum == 1) {
				System.out.println("C");
			} else if (sum == 0) {
				System.out.println("D");
			} else if (sum == 4) {
				System.out.println("E");
			} // 조건 완료
			sum = 0;			
		}

		scan.close();

	}

}
