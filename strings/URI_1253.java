package strings;

import java.util.Scanner;

public class URI_1253 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        while (n > 0) {

            String str = sc.nextLine();
            int num = sc.nextInt();
            sc.nextLine();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                int b = str.charAt(i) - num;
                if (b > 90) {
                    b -= 26;
                    sb.append((char) b);
                } else if (b < 65) {
                    b += 26;
                    sb.append((char) b);
                } else {
                    sb.append((char) b);
                }
            }

            System.out.println(sb.toString());

            n--;
        }
        sc.close();
    }
}
