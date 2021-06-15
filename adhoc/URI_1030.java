package adhoc;

import java.util.ArrayList;
import java.util.Scanner;

public class URI_1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nc = sc.nextInt();
        int temp = nc;

        while (nc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int atual = 0;
            ArrayList<Integer> array = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                array.add(i+1);
            }

            while (array.size() > 1) {
                atual = (atual + (k - 1)) % array.size();
                array.remove(atual);
            }
            System.out.printf("Case %d: %d\n", (temp - nc), array.get(0));
        }
        sc.close();
    }
}
