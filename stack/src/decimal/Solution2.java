package decimal;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble(); // ����
		double w; // �غ�
		double h; // ����

		double temp = Math.sqrt(n); // ����

		for (w = Math.floor(temp); w > 1; w--) {
			h = n / w;
			double a = Math.floor(h);
			if (a == h) {
				System.out.println(Math.abs(w - h));
				break;
			}
		}

		// �غ����� ���� ���� ���� ���簢���϶� ���� �۴�. �׷��ϱ� ������ ��Ʈ�� ���� ������ �������� ���Ʒ��� �����Ѵ�.

		scan.close();

	}

}
