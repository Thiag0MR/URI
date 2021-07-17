package strings;

import java.io.IOException;
import java.util.Scanner;

public class URI_1238 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int n = leitor.nextInt();
    	
    	for (int i = 0; i < n; i++) {
    		String a = leitor.next();
    		String b = leitor.next();
    		StringBuilder sb = new StringBuilder();
    		
    		int tam = (a.length() > b.length()) ? b.length() : a.length();
    		
    		for (int j = 0; j < tam; j++) {
    			sb.append(a.charAt(j));
    			sb.append(b.charAt(j));
    		}
    		
    		if (a.length() > b.length()) {
    			sb.append(a.substring(tam));
    		} else if (b.length() > a.length()){
    			sb.append(b.substring(tam));
    		}
    		
    		System.out.println(sb.toString());
    	}
    	
    	leitor.close();
    }
	
}