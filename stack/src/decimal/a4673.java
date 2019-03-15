package decimal;

public class a4673 {

	public static void main(String[] args) {

		a4673 a = new a4673();
		int n = 1;
		while(true) {
			int sum = a.f1(n);			
			System.out.println(sum);
			if(sum>10000) {
				break;
			}
		}
		

	}

	public int f1(int n) {
		n = (n / 10) + (n % 10) + 3;
		System.out.println(n);
		return n;
	}

}
