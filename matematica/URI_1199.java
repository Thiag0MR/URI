package matematica;

import java.util.ArrayDeque;
import java.util.Scanner;

public class URI_1199 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();

            if (s.equals("-1")) {
                break;
            }

            if (s.length() > 1 && s.charAt(0) == '0' && s.charAt(1) == 'x') {
                int result = 0;
                for (int i = s.length() - 1; i >= 2; i--) {
                    int expoente = s.length() - 1 - i;
                    byte b = (byte) Character.toUpperCase(s.charAt(i));
                    if (b >= 65) {
                        b -= 55;
                    } else {
                        b -= 48;
                    }
                    result += Math.pow(16,expoente) * b;
                }
                System.out.println(result);
            } else {
                ArrayDeque<Integer> pilha = new ArrayDeque<>();
                int num = Integer.parseInt(s);
                while (num / 16 != 0 || num % 16 != 0) {
                    int r = num % 16;
                    int q = num / 16;
                    pilha.push(r);
                    num = q;
                }

                System.out.print("0x");
                while (!pilha.isEmpty()) {
                    if (pilha.peek() > 9) {
                        char temp = (char) (pilha.pop() + 55);
                        System.out.print(temp);
                    } else {
                        System.out.print(pilha.pop());
                    }

                }
                System.out.println();
            }
        }
        sc.close();
    }
}

