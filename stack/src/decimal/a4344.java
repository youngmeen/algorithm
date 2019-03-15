package decimal;

import java.util.Scanner;

public class a4344 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt();
	

		for (int i = 0; i < C; i++) {
			int sum = 0;
			double avg = 0;
			int count = 0;
			int[] score = new int[1000];
			int n = scan.nextInt();
			for (int j = 0; j < n; j++) {
				score[j] = scan.nextInt();
				sum = sum + score[j];
			}
			avg = (double) sum / n;
			for (int j = 0; j < n; j++) {
				if (score[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", (double) count / n * 100);
			System.out.println("%");
		}

		scan.close();

	}

}
