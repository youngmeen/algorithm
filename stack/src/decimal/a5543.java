package decimal;

import java.util.Arrays;
import java.util.Scanner;

public class a5543 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int[] sum = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		sum[0] = arr[0] + arr[3] - 50;
		sum[1] = arr[0] + arr[4] - 50;
		sum[2] = arr[1] + arr[3] - 50;
		sum[3] = arr[1] + arr[4] - 50;
		sum[4] = arr[2] + arr[3] - 50;
		sum[5] = arr[2] + arr[4] - 50;

	
		Arrays.sort(sum);

		System.out.println(sum[0]);
	}

}
