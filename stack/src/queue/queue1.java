package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class queue1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        int i = 0;
        sc.nextLine();

        while (i < num) {

            String comand = sc.nextLine();
            StringTokenizer st = new StringTokenizer(comand, " ");
            String firstHalf = st.nextToken();
            String secondHalf = "";
            if(st.hasMoreElements()) {
                secondHalf= st.nextToken();
            }

            switch (firstHalf) {
                case "push":
                    q.add(Integer.parseInt(secondHalf));
                    break;
                case "pop":
                    System.out.println(q.isEmpty() ? -1 : q.poll());
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    if(q.isEmpty()){
                        System.out.println("-1");
                    } else {
                        System.out.println(((LinkedList<Integer>) q).getFirst());
                    }
                    break;
                case "back":
                    if(q.isEmpty()){
                        System.out.println("-1");
                    } else {
                        System.out.println(((LinkedList<Integer>) q).getLast());
                    }
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            i++;
        }
    }
}