package iniciante;

import java.io.IOException;
import java.util.Scanner;

// 1858 - A Resposta de Theon
public class URI_1858 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int T, menor = 20, posMenor = 0;
		for (int i = 0; i < N; i++) {
			T = leitor.nextInt();
			if (T < menor) {
				menor = T;
				posMenor = i;
			}
		}
		System.out.println(posMenor + 1);
		
		leitor.close();
    }
	
}