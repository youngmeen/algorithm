package decimal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class a15552 {

	public static void main(String[] args) throws IOException, NumberFormatException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 識情
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 識情
		
		int T = Integer.parseInt(bf.readLine());

		for (int i = 0; i < T; i++) {

			String text = bf.readLine();
			int index = text.indexOf(" ");

			int a = Integer.parseInt(text.substring(0, index));
			int b = Integer.parseInt(text.substring(index+1, text.length()));

			bw.write((a + b) + "\n");

		}
		bw.flush();
		bw.close();

	}

}
