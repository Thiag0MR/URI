package strings;

import java.util.Arrays;
import java.util.Scanner;

public class URI_1255 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\\s");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();

            int arr[] = new int[26];

            Arrays.fill(arr, 0);

            str = str.toLowerCase();

            for (int j = 0; j < str.length(); j++) {
                if (str.codePointAt(j) > 96 && str.codePointAt(j) < 123){
                    arr[str.codePointAt(j) % 97]++;
                }
                
            }

            int x = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > x) {
                    x = arr[j];
                }
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    System.out.printf("%c", j + 97);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
