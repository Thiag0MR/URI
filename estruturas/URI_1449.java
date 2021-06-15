package estruturas;

import java.util.HashMap;
import java.util.Scanner;

public class URI_1449 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int g = sc.nextInt();

        while (g > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();

            HashMap<String, String> dicio = new HashMap<>();

            for (int i = 0; i < m; i++) {
                String chave = sc.nextLine();
                String valor = sc.nextLine();
                dicio.put (chave, valor);
            }

            for (int i = 0; i < n; i++) {
                String frase = sc.nextLine();
                String[] palavras = frase.split(" ");

                StringBuilder sb = new StringBuilder();

                for (String s: palavras) {
                    if (dicio.containsKey(s)) {
                        sb.append(dicio.get(s) + ' ');
                    } else {
                        sb.append(s + ' ');
                    }
                }

                String resultadoFinal = sb.toString();

                if (resultadoFinal.endsWith(" ")) {
                    System.out.println(resultadoFinal.substring(0,resultadoFinal.length() - 1));
                } else {
                    System.out.println(resultadoFinal);
                }

            }

            System.out.println();

            g--;
        }
        sc.close();
    }
}
