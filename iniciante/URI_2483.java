package iniciante;

import java.util.Scanner;

public class URI_2483 {
    public static void main (String args[]){

        int i;
        Scanner sc = new Scanner(System.in);
        String str1 = "Feliz nata";
        String str2 = "l!";


        i = sc.nextInt();

        for (int j = 1; j < i; j++) {
            str1 += "a";
        }

        str1 += str2;

        System.out.println(str1);
        sc.close();
    }
}
