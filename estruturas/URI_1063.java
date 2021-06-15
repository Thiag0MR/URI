package estruturas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class URI_1063 {
    public static void main(String[] args) {
        int N;

        Scanner sc = new Scanner(System.in);

        while(true) {
            N = sc.nextInt();
            if (N == 0) {
                break;
            }

            String str1;
            String str2;
        	ArrayDeque<String> f1 = new ArrayDeque<>();
            ArrayDeque<String> f2 = new ArrayDeque<>();
            ArrayDeque<String> p1 = new ArrayDeque<>();

            sc.nextLine();
            str1 = sc.nextLine();
            str2 = sc.nextLine();

            String[] c1 = str1.split(" ");
            String[] c2 = str2.split(" ");

            for (int i = 0; i < N; i++) {
                f1.addLast(c1[i]);
                f2.addLast(c2[i]);
            }

            StringBuilder builder = new StringBuilder();

            boolean v = true;
            String n = f2.peekFirst();

            while(!f1.isEmpty() || !p1.isEmpty()) {
                if (!f1.isEmpty() && f1.getFirst().equals(n)){
                    f1.removeFirst();
                    f2.removeFirst();
                    n = f2.peekFirst();
                    builder.append("IR");
                } else {
                    if (!p1.isEmpty() && p1.getFirst().equals(n)){
                        f2.removeFirst();
                        n = f2.peekFirst();
                        builder.append("R");
                        p1.pop();
                    } else {
                        if (f1.isEmpty()) {
                            v = false;
                            break;
                        }else {
                            p1.push(f1.removeFirst());
                            builder.append("I");
                        }
                    }
                }
            }

            if (v) {
                System.out.println(builder.toString());
            } else {
                System.out.println(builder.toString() + " Impossible");
            }


        }

        sc.close();
    }
}
