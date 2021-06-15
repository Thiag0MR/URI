package adhoc;

import java.util.Scanner;

public class URI_2455 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int p1 = sc.nextInt();
        int c1 = sc.nextInt();
        int p2 = sc.nextInt();
        int c2 = sc.nextInt();

        if ((p1 * c1) == (p2 * c2)) {
            System.out.println("0");
        } else {
            if ((p1 * c1) > (p2 * c2)) {
                System.out.println("-1");
            } else {
                System.out.println("1");
            }
        }

        sc.close();
    }
}
