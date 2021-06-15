package estruturas;

import java.util.Arrays;
import java.util.Scanner;

public class URI_1244 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            String[] strs = input.split(" ");

            Arrays.sort (strs, (String first, String second) ->
                {
                    if (first.length() < second.length()) return 1;
                    else if (first.length() > second.length()) return -1;
                    else return 0;
                });

            for (int j = 0; j < strs.length; j++) {
                if (j == strs.length - 1) {
                    System.out.print(strs[j]);
                } else {
                    System.out.print(strs[j] + " ");
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
