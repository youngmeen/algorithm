package decimal;

import java.util.Scanner;

public class a2309 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		int temp;
		int[] arr = new int[100];
		while (true) {
			int height = scan.nextInt();
			arr[i] = height;
			i++;
			sum += height;
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
			
			if (arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i + 1] = temp;
			}

			if (sum > 100) {
				
				break;
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
	}

}
