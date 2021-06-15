package estruturas;

import java.util.Scanner;

public class URI_1162 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int contador  = 0;

            int t = sc.nextInt();

            int arr[] = new int[t];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 1; j < arr.length; j++) {
                for (int k = j; k > 0; k--) {
                    if (arr[k] < arr[k - 1]) {
                        int temp = arr[k];
                        arr[k] = arr[k - 1];
                        arr[k - 1] = temp;
                        contador++;
                    }
                }

            }

            System.out.printf("Optimal train swapping takes %d swaps.\n", contador);

        }
        sc.close();
    }
}
