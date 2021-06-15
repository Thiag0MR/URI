package iniciante;

import java.util.Scanner;

public class URI_1113 {
    public static void main (String args[]){
        int x, y;
        Scanner sc = new Scanner(System.in);

        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (x == y) {
                break;
            } else {
                if (x > y) {
                    System.out.println("Decrescente");
                } else {
                    System.out.println("Crescente");
                }
            }
        }
        sc.close();
    }
}
