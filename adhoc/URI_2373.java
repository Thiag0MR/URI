package adhoc;

import java.util.Scanner;

public class URI_2373 {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        int contador = 0;
    	int c = sc.nextInt();

        while (c > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n > m) {
                contador += m;
            }

            c--;
        }

        System.out.println(contador);

    	sc.close();
    }
}
