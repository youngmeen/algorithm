package decimal;
import java.util.Scanner;

public class a10872 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int sum = 1;

		scan.close();
		for (int i = a; i > 0; i--) {
			sum *= i;

		}

		System.out.println(sum);

	}

}
