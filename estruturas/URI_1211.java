package estruturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            int n = sc.nextInt();
            sc.nextLine();
            List<String> lista = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lista.add(sc.nextLine()) ;
            }
            Collections.sort(lista);
            int count = 0;
            for (int i = 1; i < lista.size(); i++) {
                String anterior = lista.get(i - 1);
                String atual = lista.get(i);
                for (int j = 0; j < atual.length(); j++) {
                    if (anterior.charAt(j) == atual.charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
