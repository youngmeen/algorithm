package decimal;

import java.util.Scanner;

public class a5596 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] d = new int[4];
		int[] m = new int[4];
		int d_sum = 0;
		int m_sum = 0;

		for (int i = 0; i < d.length; i++) {
			d[i] = scan.nextInt();
			d_sum += d[i];
		}
		for (int i = 0; i < m.length; i++) {
			m[i] = scan.nextInt();
			m_sum += m[i];
		}

		if (d_sum > m_sum) {
			System.out.println(d_sum);
		} else if (d_sum < m_sum) {
			System.out.println(m_sum);
		}else if(d_sum == m_sum) {
			System.out.println(m_sum);
		}
	}

}
