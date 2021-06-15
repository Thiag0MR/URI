package iniciante;

import java.util.Scanner;

public class URI_1114 {
    public static void main (String args[]){

        int temp;

        Scanner sc = new Scanner(System.in);

        temp = sc.nextInt();

        if (temp == 2002) {
            System.out.println("Acesso Permitido");
        } else {
            while (temp != 2002) {
                temp = sc.nextInt();
                System.out.println("Senha Invalida");
            }
            System.out.println("Acesso Permitido");
        }
        sc.close();
    }
}
