package matematica;

import java.util.Locale;
import java.util.Scanner;

public class URI_1214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while (c-- > 0) {
            int n = sc.nextInt();
            int[] notas = new int[n];
            double media = 0.0;
            for (int i = 0; i < notas.length; i++) {
                notas[i] = sc.nextInt();
                media += notas[i];
            }
            media = media/notas.length;
            double count = 0.0;
            for (double s : notas) {
                if (s > media) {
                    count++;
                }
            }
            double resultado = (count * 100.0)/notas.length;
            System.out.printf(Locale.ENGLISH, "%.3f%s\n", resultado, "%");

        }
        sc.close();
    }
}
