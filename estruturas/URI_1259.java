package estruturas;

import java.util.*;

public class URI_1259 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        Iterator<Integer> itPares = pares.iterator();
        Iterator<Integer> itImpares = impares.iterator();

        while (itPares.hasNext()) {
            System.out.println(itPares.next());
        }

        while (itImpares.hasNext()) {
            System.out.println(itImpares.next());
        }

        sc.close();
    }
}
