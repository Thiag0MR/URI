package estruturas;

import java.util.Scanner;

public class URI_1066 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par = 0, impar = 0, positivo = 0, negativo = 0;

        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            if (temp % 2 == 0) {
                par++;
                if (temp > 0) {
                    positivo++;
                } else if (temp < 0){
                    negativo++;
                }
            } else {
                impar++;
                if (temp > 0) {
                    positivo++;
                } else {
                    negativo++;
                }
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
        
        sc.close();
    }
 
}
