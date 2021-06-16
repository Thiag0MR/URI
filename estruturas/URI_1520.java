package estruturas;

import java.util.Arrays;
import java.util.Scanner;

public class URI_1520 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int[] array = new int[10000];
			Arrays.fill(array, 0);
			
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				for (int j = x; j <= y; j++) {
					array[j]++;
				}
			}
			int num = sc.nextInt();
			if (array[num] > 0) {
				int soma = 0;
				for(int i = 0; i < num; i++) {
					soma += array[i];
				}
				System.out.print(num + " found from " + soma);
				System.out.println(" to " + (soma + array[num] - 1));
			} else {
				System.out.println(num + " not found");
			}
		}
		sc.close();
	}
}
