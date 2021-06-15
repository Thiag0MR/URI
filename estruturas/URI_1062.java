package estruturas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class URI_1062 {
    public static void main(String[] args) {
        int N;

        Scanner sc = new Scanner(System.in);

        while(true) {
            N = sc.nextInt();
            if (N == 0) {
                break;
            }
            while(true) {
            	ArrayDeque<Integer> p1 = new ArrayDeque<>();
                ArrayDeque<Integer> p2 = new ArrayDeque<>();

                boolean aux1 = true;
                for (int i = 0; i < N; i++) {
                    int aux = sc.nextInt();
                    if (aux == 0) {
                        aux1 = false;
                        System.out.println();
                        break;
                    }
                    p1.push(aux);
                }
                if (aux1 == false) {
                    break;
                }

                boolean v = true;
                int n = p1.size();

                while(!p1.isEmpty() || !p2.isEmpty()) {
                    if (!p1.isEmpty() && p1.getFirst() == n){
                        n--;
                        p1.pop();
                    } else {
                        if (!p2.isEmpty() && p2.getFirst() == n){
                            n--;
                            p2.pop();
                        } else {
                            if (p1.isEmpty()) {
                                v = false;
                                break;
                            }else {
                                p2.push(p1.getFirst());
                                p1.pop();
                            }
                        }
                    }
                }

                if (v) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

        }

        sc.close();
    }
}
