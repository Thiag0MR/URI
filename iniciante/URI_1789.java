package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1789 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	
    	while (leitor.hasNext()) {
    		int n = leitor.nextInt();
    		int nivel = 0;
    		for (int i = 0; i < n; i++) {
    			int num = leitor.nextInt();
    			if (num < 10) {
    				nivel = (nivel > 1) ? nivel : 1;
    			} else if (num >= 10 && num < 20) {
    				nivel = (nivel > 2) ? nivel : 2;
    			} else {
    				nivel = 3;
    			}
    		}
    		System.out.println(nivel);
    	}
    	leitor.close();
    }
	
}