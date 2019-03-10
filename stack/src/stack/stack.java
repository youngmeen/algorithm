package stack;

import java.util.Scanner;

public class stack {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int[] stack = new int[x];
		int size = 0;
		String command;

		for (int i = 0; i < x; i++) {
			command = scan.next();

			if (command.equals("push")) {
				int num = scan.nextInt();
				size++;
				stack[size] = num;				
			} else if (command.equals("pop")) {
				if (size == -1) {
					System.out.println(-1);
				} else {
					System.out.println(stack[size]);
					size--;
				}
			} else if (command.equals("size")) {
				System.out.println(size);
			} else if (command.equals("empty")) {
				if (size == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (command.equals("top")) {
				if (size == 0) {
					System.out.println(-1);
				} else {
					System.out.println(stack[size]);
				}
			}

		}

	}

}
