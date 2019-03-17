package decimal;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[1000001];
		int l = 0;
		int len = 0;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i=0; i<n; i++) {
			if (arr[i] >= l) {
				if (ans < len+1) {
					ans = len+1;
				}
				len = 0;
				l = arr[i];
			}
			else {
				len++;
			}
			if (ans < len) {
				ans = len;
			}
		}
		System.out.println(ans);

	}

}
