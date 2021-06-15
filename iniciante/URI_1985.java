package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class URI_1985 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        float valor = 0F;

        while (n-- > 0) {
            int numero = sc.nextInt();
            int qtd = sc.nextInt();

            switch (numero) {
                case 1001:
                    valor += qtd * 1.50;
                    break;
                case 1002:
                    valor += qtd * 2.50;
                    break;
                case 1003:
                    valor += qtd * 3.50;
                    break;
                case 1004:
                    valor += qtd * 4.50;
                    break;
                case 1005:
                    valor += qtd * 5.50;
                    break;
                default:
            }
        }

        System.out.printf(Locale.US, "%.2f\n", valor);   
        sc.close();
    }
}
