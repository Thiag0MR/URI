package strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class URI_1222 {
    public static void main(String[] args) {
        class Par {
            int qtd_caracter;
            LinkedList<String> linha;
            public Par () {
                qtd_caracter = 0;
                linha = new LinkedList<>();
            }
            public Par (int a, String b){
                qtd_caracter = b.length();
                linha = new LinkedList<>();
                linha.add(b);
            }
        }
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s");
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int c = sc.nextInt();
            ArrayList<String> palavras = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                palavras.add(sc.next());
            }
            ArrayList<Par> linhas = new ArrayList<>();
            linhas.add(new Par());

            for(String palavra: palavras) {
                Par ultimoPar = linhas.get(linhas.size()-1);
                ultimoPar.linha.add(palavra);
                ultimoPar.qtd_caracter += palavra.length();
                if (ultimoPar.linha.size() > 1) {
                    ultimoPar.qtd_caracter += 1;
                }
                if (ultimoPar.qtd_caracter > c) {
                    ultimoPar.linha.remove(ultimoPar.linha.size() - 1);
                    ultimoPar.qtd_caracter -= palavra.length() - 1;
                    linhas.add(new Par(0,palavra));
                }
            }
            int temp = linhas.size() % l != 0 ? (linhas.size() / l) + 1 : linhas.size() / l;
            System.out.println(temp);
        }
        sc.close();
    }
}
