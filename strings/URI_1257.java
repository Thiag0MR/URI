package strings;

import java.util.Scanner;

public class URI_1257 {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            int m = sc.nextInt();
            sc.nextLine();

            int valor = 0;
            for (int i = 0; i < m; i++) {
                String aux = sc.nextLine();
                for (int j = 0; j < aux.length(); j++) {
                    valor += (aux.charAt(j) - 65) + i + j;
                }
            }

            System.out.println(valor);

            n--;
        }


    	sc.close();
    }
}
