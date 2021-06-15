package adhoc;

import java.util.Scanner;

public class URI_1250 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num_alt = sc.nextInt();

            int altura[] = new int[num_alt];

            for (int j = 0; j < num_alt; j++) {
                altura[j] = sc.nextInt();
            }
            sc.nextLine();

            String seq = sc.nextLine();

            int count = 0;

            for (int j = 0; j < num_alt; j++) {
                if (seq.charAt(j) == 'J' && altura[j] > 2) {
                    count++;
                } else {
                    if (seq.charAt(j) == 'S' && altura[j] <= 2) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}

