package estruturas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class URI_1452 {
    public static void main(String[] args) {
    	int N, M;
    	Scanner sc = new Scanner(System.in);

    	while (true) {
    		N = sc.nextInt();
    		M = sc.nextInt();

    		if (N == 0 && M == 0) {
    			break;
    		}

    		ArrayList<HashSet<String>> servidores = new ArrayList<>(N);
    		ArrayList<ArrayList<String>> clientes = new ArrayList<>(M);

    		for (int i = 0; i < N; i++) {
    			int q = sc.nextInt();
    			servidores.add(new HashSet<String>());
    			while (q > 0) {
    				String c = sc.next();
    				servidores.get(i).add(c);
    				q--;
    			}
    		}

    		for (int i = 0; i < M; i++) {
    			int q = sc.nextInt();
    			clientes.add(new ArrayList<String>(q));
    			while (q > 0) {
    				String c = sc.next();
    				clientes.get(i).add(c);
    				q--;
    			}
    		}

    		int contador = 0;
            boolean v = false;
    		for (int i = 0; i < servidores.size(); i++) {
    			for (int j = 0; j < clientes.size(); j++) {
    				for (int k = 0; k < clientes.get(j).size(); k++) {
    					if (servidores.get(i).contains(clientes.get(j).get(k))) {
    						v = true;
    						break;
    					}
    				}
    				if (v) {
    					contador++;
    					v = false;
    				}
    			}
    		}
    		System.out.println(contador);

    	}

    	sc.close();
    }
}

