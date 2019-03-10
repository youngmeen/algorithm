package decimal;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int dp[] = new int[1000001];
		dp[1] = 0;

		for (int i = 0; i < n + 1; i++) {
			dp[i] = dp[i - 1] + 1;

			if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
				dp[i] = dp[i / 2] + 1;
			} else if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
				dp[i] = dp[i / 3] + 1;
			}

		}

		System.out.println(dp[n]);
		scan.close();

	}

}
