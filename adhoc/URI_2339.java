package adhoc;

import java.util.Scanner;

public class URI_2339 {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int p = sc.nextInt();
        int t = sc.nextInt();

        if (c * t <= p) {
            System.out.println("S");
        }else {
            System.out.println("N");
        }


    	sc.close();
    }
}

