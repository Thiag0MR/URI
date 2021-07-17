package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

// 1190 - Área Direita
public class URI_1190{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        double soma = 0;
        char O = leitor.nextLine().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
        	for (int j = 0; j < 12; j++) {
        		M[i][j] = leitor.nextDouble();
        	}
        }
        
        int temp = 12;
        boolean aux = false;
        for (int i = 1; i <= 10; i++) {
        	temp = aux ? temp+1 : temp-1;
        	if (temp == 6) {
        		aux = true;
        		temp = 7;
        	}
        	for (int j = temp; j <= 11; j++) {
        		soma += M[i][j];
        	}
        }

        if (O == 'M') soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    	
    	leitor.close();
    }
	
}