package matematica;

import java.util.Scanner;

public class URI_1240 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean v = true;

            do{
                int r1 = a % 10;
                int r2 = b % 10;
                a = a / 10;
                b = b / 10;
                if (r1 != r2) {
                    v = false;
                    break;
                }
            } while (b > 0);

            if (v) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
        sc.close();
    }
}
