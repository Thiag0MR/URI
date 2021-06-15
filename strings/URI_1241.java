package strings;

import java.util.Scanner;

public class URI_1241 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\\s");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            if (a.length() >= b.length()) {

                int j = b.length() - 1;

                boolean v = false;
                while (j >= 0) {
                    int x = a.length() - ((b.length() - 1) - j) - 1;
                    if (b.charAt(j) != a.charAt(x)) {
                        System.out.println("nao encaixa");
                        v = true;
                        break;
                    }
                    j--;
                }
                if (!v) {
                    System.out.println("encaixa");
                }
                

            } else {
                System.out.println("nao encaixa");
            }
        }
        sc.close();
    }
}
