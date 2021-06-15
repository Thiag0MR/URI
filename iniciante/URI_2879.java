package iniciante;

import java.util.Scanner;

public class URI_2879 {
    public static void main(String[] args) {
        int contador = 0;
        int num = 0;
        int aux = 0;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            aux = sc.nextInt();
            if (aux != 1) {
                contador++;
            }
        }

        System.out.println(contador);

        sc.close();

    }
}
