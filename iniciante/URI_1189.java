package iniciante;

import java.util.Scanner;
import java.util.Locale;

public class URI_1189 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        float[][] ma = new float[12][12];

        String c = sc.nextLine();

        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = sc.nextFloat();
            }
        }

        float soma = 0F;
        float media = 0F;
        int contador = 0;
        for (int i = 1; i < (ma.length - 1); i++) {
            for (int j = 0; j < ( i > 5 ? (ma[i].length - i - 1):(ma[i].length - (ma[i].length - i))); j++) {
                soma += ma[i][j];
                contador++;
            }
        }

        if (c.charAt(0) == 'S') {
            System.out.println(String.format(Locale.US,"%.1f",soma));
        } else {
            media = soma/(float) contador;
            System.out.println(String.format(Locale.US,"%.1f",media));
        }

        sc.close();

    }
}
