package strings;

import java.util.Scanner;

public class URI_1120 {
    public static void main(String args[]) {
        String str;
        char num;
        boolean aux;
        Scanner sc = new Scanner(System.in);

        while (true) {
            str = sc.nextLine();
            aux = false;

            if (str.length() == 3 && str.charAt(0) == '0' && str.charAt(2) == '0') {
               break;
            }

            num = str.charAt(0);

            for (int i = 2; i < str.length(); i++) {
                if (str.charAt(i) != num) {
                    if (str.charAt(i) != '0') {
                        System.out.print(str.charAt(i));
                        aux = true;
                        continue;
                    } else {
                        if (aux) {
                            System.out.print(str.charAt(i));

                        }
                    }
                }
            }
            if (!aux) {
                System.out.println("0");
            } else {
                System.out.println();
            }
        }
        sc.close();
    }
}
