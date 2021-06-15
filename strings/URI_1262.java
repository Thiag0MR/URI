package strings;

import java.util.Scanner;

public class URI_1262 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String str = sc.nextLine();
            int num_processos = sc.nextInt();
            sc.nextLine();

            boolean v = false;
            int aux = 0;
            int cont = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'R') {
                    if (v) {
                        aux++;
                        if (num_processos == aux){
                            cont++;
                            v = false;
                        }
                    } else {
                        if (num_processos != 1) {
                            aux = 1;
                            v = true;
                        } else {
                            cont++;
                        }

                    }
                } else {
                    if (v) {
                        cont += 2;
                        v = false;
                    } else {
                        cont++;
                    }
                }
            }

            if (v) {
                cont++;
            }

            System.out.println(cont);

        }
        sc.close();
    }
}
