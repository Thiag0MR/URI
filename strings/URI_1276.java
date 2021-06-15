package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class URI_1276 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			
			boolean arr[] = new boolean[26];
			
			Arrays.fill(arr, false);
			
			for (int i = 0; i < s.length(); i++) {
				char a = s.charAt(i);
				if (a >= 97) {
					arr[a - 97] = true;
				}
			}
			
			ArrayList<String> resultados = new ArrayList<> ();
			
			
			boolean l = false;
			boolean v = false;
			char inicio = 0;
			char fim = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]) {
					l = true;
					if (!v) {
						inicio = (char) (i + 97);
						fim = (char) (i + 97);
						v = true;
					} else {
						fim = (char) (i + 97);
					}
				} else {
					if (v) {
						resultados.add(inicio + ":" + fim);
						v = false;
					}
				}
			}
			
			if (v) {
				resultados.add(inicio + ":" + fim);
			}
			
			if (!l) {
				System.out.println();
			} else {
				for (int i = 0; i < resultados.size(); i++) {
					if (i == resultados.size() - 1) {
						System.out.print(resultados.get(i) + "\n");
					} else {
						System.out.print(resultados.get(i) + ", ");
					}
				}
			}
		}
		sc.close();
	}
}
