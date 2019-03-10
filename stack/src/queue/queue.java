package queue;

import java.util.Scanner;

public class queue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String command;
		int[] queue = new int[100000];
		int pos = -1;

		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			command = scan.next();

			if (command.equals("push")) {
				pos++;
				queue[pos] = scan.nextInt();
			} else if (command.equals("pop")) {
				if (pos == -1) {
					System.out.println(-1);
				} else {
					System.out.println(queue[0]);
					queue[0] = queue[1];
					pos--;
				}
			} else if (command.equals("size")) {
				System.out.println(pos);
			} else if (command.equals("empty")) {
				if (pos == -1) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (command.equals("front")) {
				if (pos == -1) {
					System.out.println(-1);
				} else {
					System.out.println(queue[0]);
				}
			} else if (command.equals("back")) {
				if (pos == -1) {
					System.out.println(-1);
				} else {
					System.out.println(queue[pos]);
				}
			}
		}

	}

}
