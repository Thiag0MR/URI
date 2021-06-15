package adhoc;

import java.util.Scanner;

public class URI_1140 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String str = sc.nextLine();

            if (str.equals("*")) {
                break;
            }

            char l = Character.toLowerCase(str.charAt(0));
            boolean v = true;

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == ' ') {
                    if (l != str.charAt(i + 1)) {
                        char m = Character.toLowerCase(str.charAt(i + 1));
                        if (l != m) {
                            System.out.println("N");
                            v = false;
                            break;
                        }
                    }
                }
            }
            if (v) {
                System.out.println("Y");
            }
        }
        sc.close();
    }
}

