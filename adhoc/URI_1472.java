package adhoc;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class URI_1472 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            Queue<Integer> fila = new ArrayDeque<>();

            int soma = 0;
            for (int i = 0; i < n; i++) {
                int aux = sc.nextInt();
                fila.add(aux);
                soma += aux;
            }

            boolean pontos[] = new boolean[soma + 1];

            Arrays.fill (pontos, false);

            pontos[0] = true;
            int temp = 0;
            while (!fila.isEmpty()) {
                temp = temp + fila.remove();
                pontos[temp] = true;
            }

            int count = 0;
            for (int i = 0; i < pontos.length; i++) {
                if (pontos[i]) {
                    int p1 = ((soma/3) + i) % soma;
                    int p2 = (2 * (soma/3) + i) % soma;
                    int p3 = (3 * (soma/3) + i) % soma;
                    if (pontos[p1] && pontos[p2] && pontos[p3]) {
                        count++;
                    }
                }
            }

            System.out.println(count/3);
        }
        sc.close();
    }
}
