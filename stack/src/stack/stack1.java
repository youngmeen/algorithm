package stack;

import java.util.Scanner;

public class stack1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String command;
		int[] stack = new int[100000];
		int num = scan.nextInt();
		int pos = -1;
		int a;

		for (int i = 0; i < num; i++) {

			command = scan.next();

			if (command.equals("push")) {
				pos++;
				stack[pos] = scan.nextInt();
			} else if (command.equals("pop")) {
				if (pos == -1) {
					System.out.println(-1);
				} else {
					System.out.println(stack[pos]);
					pos--;
				}
			} else if (command.equals("size")) {
				System.out.println(pos+1);
			} else if (command.equals("empty")) {
				if (pos == -1) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (command.equals("top")) {
				if (pos == -1) {
					System.out.println(-1);
				} else {
					System.out.println(stack[pos]);
				}
			}
		}

	}
}
