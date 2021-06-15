package iniciante;

import java.util.Scanner;

public class URI_2896 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        while (n > 0) {
            int o = sc.nextInt();
            int p = sc.nextInt();

            System.out.println((o/p) + (o%p));


            n--;
        }

        sc.close();

    }
}
