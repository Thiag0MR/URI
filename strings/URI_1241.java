package strings;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class URI_1241 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int n = leitor.nextInt();
    	
    	for (int i = 0; i < n; i++) {
    		String a = leitor.next();
    		String b = leitor.next();
    		
    		if (a.length() == b.length()) {
    			if (a.equals(b)) {
    				System.out.println("encaixa");
    			} else {
    				System.out.println("nao encaixa");
    			}
    		} else {
    			if (a.length() > b.length()) {
    				if (Objects.equals(a.substring(a.length() - b.length()), b)) {
    					System.out.println("encaixa");
    				} else {
    					System.out.println("nao encaixa");
    				}
    			} else {
    				System.out.println("nao encaixa");
    			}
    		}
    	}
    	
    	leitor.close();
    }
	
}