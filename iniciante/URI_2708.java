package iniciante;

import java.util.Scanner;

public class URI_2708 {
    public static void main (String[] args) {
        int jipes = 0;
        int turistas = 0;
        String aux;
        Scanner sc = new Scanner (System.in);

        while (!(aux = sc.nextLine()).equals("ABEND")) {

            String[] entrada = aux.split(" ");
            if (entrada[0].equals("SALIDA")) {
                turistas += Integer.parseInt(entrada[1]);
                jipes++;
            } else if (entrada[0].equals("VUELTA")) {
                turistas -= Integer.parseInt(entrada[1]);
                jipes--;
            }
        }

        sc.close();

        System.out.println(turistas);
        System.out.println(jipes);
    }
}
