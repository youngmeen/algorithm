package decimal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class a10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		// 10000000 ���̱� ������ sort�� ����ϸ� �ȵȴ�.
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 1; i < 10000; i++) {
			if (arr[i] > 0) { // arr[i]�� 0���� �۰ų� ������ ���� Ƚ���� ���� ������ �н�
				for (int j = 0; j < arr[i]; j++) {
					// ����� ������ŭ �������� �ϱ� ������
					bw.write(Integer.toString(i) + "\n");
					// bw.flush(); ���� �����ϸ� ��Ŭ���� Console�� ����� �ȵ�
				}
			}
		}
		br.close();
		bw.close();
	}

}
