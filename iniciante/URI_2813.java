package iniciante;

import java.util.Scanner;

public class URI_2813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = 0, E = 0;
		int a = 0, b = 0;
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String SD = sc.next();
			String SN = sc.next();
			
			if (SD.equals("chuva")) {
				if (SN.equals("sol")) {
					if (a == 0) {
						C++;
						a++;
					} 
					a--;
					b++;
				} else if (SN.equals("chuva")){
					if (a == 0) {
						C++;
						a++;
					}
				}
				
				
			} else if (SD.equals("sol")){
				if (SN.equals("chuva")) {
					if (b == 0) {
						E++;
						b++;
					} 
					b--;
					a++;
				}
			}
		}
		System.out.printf("%s %s\n", C, E);
		
		sc.close();
	}
}
