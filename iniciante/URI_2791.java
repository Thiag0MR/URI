package iniciante;

import java.util.Scanner;

public class URI_2791 {
    public static void main (String args[]){
        int c[] = new int[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            c[i] = sc.nextInt();
            if (c[i] == 1) {
                System.out.println(i + 1);
                break;
            }
        }
        sc.close();
    }
}
