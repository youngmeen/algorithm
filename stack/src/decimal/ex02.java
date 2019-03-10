package decimal;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int[] min = new int[1000001]; // 10�� 6���� �ִ밪�̱� ������

		min[1] = 0; // ����ϱ� ������� �迭�� 0������ ���������� ���������� 1���� �����ϴ� ��ó�� ����.

		for (int i = 2; i < X + 1; i++) {
			min[i] = min[i - 1] + 1; // 3�̳� 2�� ���������� ������ �־��� ������ 1 ���� ���� ���� �ּ� ����Ƚ�� + (-1) ������ �� Ƚ��

			if (i % 2 == 0 && min[i / 2] + 1 < min[i]) {
				min[i] = min[i / 2] + 1; // 2�� �ٷ� ������ ���� ��� �ּڰ� ���ؼ� ���� ���� Ƚ���� ����.
			}
			if (i % 3 == 0 && min[i / 3] + 1 < min[i]) {
				min[i] = min[i / 3] + 1; // 3���� �ٷ� �������� ��, ���Ե� ���� ���� �񱳰� �̷����Ƿ� ��� ��쿡 ���� �񱳰� ����.
											// (-1) ������ �̷��� Ƚ���� 2�� �ٷ� �������� ���� ���� ���� ���� ������ min[i]�� ������ �����̴�.
			}

		}
		System.out.println(min[X]);

	}

}
