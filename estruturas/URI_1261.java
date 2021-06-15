package estruturas;

import java.util.HashMap;
import java.util.Scanner;

public class URI_1261 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Double> dicio = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String[] input = sc.nextLine().split(" ");
            dicio.put (input[0], Double.parseDouble(input[1]));
        }


        for (int i = 0; i < n; i++) {
            String input = "";
            double soma = 0.0;
            while (!input.equals(".")) {
                input = sc.nextLine();
                for (String s: input.split(" ")) {
                    soma += dicio.getOrDefault(s,0.0);
                }
            }
            System.out.printf("%.0f\n", soma);
        }
        sc.close();
    }
}
