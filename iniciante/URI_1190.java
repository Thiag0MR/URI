package iniciante;

import java.util.Scanner;

public class URI_1190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);
        float arr[][] = new float[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                arr[i][j] = sc.nextFloat();
            }
        }

        int b = 11;
        boolean v = true;
        float soma = 0;

        for (int i = 1; i < 11; i++) {
            if (b > 6 && v) {
                int j = 11;
                while (j >= b) {
                    soma += arr[i][j];
                    j--;
                }
                b--;
            } else {
                v = false;
                int j = 11;
                b++;
                while (j >= b) {
                    soma += arr[i][j];
                    j--;
                }
            }
        }

        if (op == 'S') {
            System.out.println(soma);
        } else {
            System.out.println(String.format("%.1f", soma/30).replace(',', '.'));
        }
        sc.close();
    }
}
