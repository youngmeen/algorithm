package decimal;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble(); // 넓이
		double w; // 밑변
		double h; // 높이

		double temp = Math.sqrt(n); // 내림

		for (w = Math.floor(temp); w > 1; w--) {
			h = n / w;
			double a = Math.floor(h);
			if (a == h) {
				System.out.println(Math.abs(w - h));
				break;
			}
		}

		// 밑변차가 가장 작은 것은 정사각형일때 가장 작다. 그러하기 때문에 루트를 쒸워 제곱을 때린다음 위아래로 조절한다.

		scan.close();

	}

}
