package estruturas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

public class URI_1281 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

           int m = sc.nextInt();
           sc.nextLine();

           HashMap<String, Double> frutas_disp = new HashMap<String, Double>();

           for (int j = 0; j < m; j++) {
               String[] input = new String[2];
               input = sc.nextLine().split(" ");
               frutas_disp.put (input[0], Double.parseDouble(input[1]));
           }

           int p = sc.nextInt();
           sc.nextLine();

           ArrayList< SimpleEntry<String,Integer> > lista_compra = new ArrayList<SimpleEntry<String,Integer> >();

           for (int j = 0; j < p; j++) {
               String[] input = new String[2];
               input = sc.nextLine().split(" ");
               lista_compra.add(new SimpleEntry<>(input[0], Integer.parseInt(input[1])));
           }

           Double soma = 0.0;

           for (SimpleEntry entry : lista_compra) {
               soma += (double) frutas_disp.get(entry.getKey()) * (int) entry.getValue();
           }

           System.out.println(String.format(Locale.US, "R$ %.2f", soma));

        }
        sc.close();
    }
}
