package decimal;

import java.util.Scanner;

public class a1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int sosuCnt = 0, cnt = 0;

		for (int i = 0; i <= num; i++) {
			int num2 = scan.nextInt();
			sosuCnt = 0;			
			for (int j = 0; j <= num2; j++) {
				if(num2 % j == 0) {
					sosuCnt++;
				}
			}
			if(sosuCnt == 2) {
				cnt++;
			}
		}
		System.out.println(cnt);

		scan.close();

	}

}
