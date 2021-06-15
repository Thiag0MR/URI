package estruturas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class URI_1242 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		while (sc.hasNext()) {
			String str = sc.nextLine();
			
			ArrayDeque<Character> pilha1 = new ArrayDeque<>();
			
			int max = 0;
			int qtd = 0;
			
			for (int i = 0; i < str.length() - 1; i++) {
				
				if (match(str.charAt(i), str.charAt(i + 1))) {
					ArrayDeque<Character> pilha2 = new ArrayDeque<>(pilha1);
					qtd = verifica (pilha2, i, str);
				}
				
				
				pilha1.push(str.charAt(i));
				
				if (max < qtd) {
					max = qtd;
				}
			}
			
			System.out.println(max);
		}
		
		sc.close();
	}

	private static int verifica(ArrayDeque<Character> pilha, int i, String str) {
		
		int contador = 0;
		int j = i;
		
		while (j < str.length() - 1) {
			if (match(str.charAt(j), str.charAt(j + 1))) {
				contador++;
				j += 2;
				while (!pilha.isEmpty() && (j < str.length()) && match(str.charAt(j), pilha.peek())) {
					j++;
					pilha.pop();
					contador++;
				}
			} else {
				pilha.push(str.charAt(j));
				j++;
			}
		}
		
		return contador;
	}
	
	private static boolean match (char a, char b) {
		if ((a == 'B' && b == 'S') || (a == 'S' && b == 'B')) {
			return true;
		} else {
			if ((a == 'C' && b == 'F') || (a == 'F' && b == 'C')) {
				return true;
			} else {
				return false;
			}
		}
	}
}
