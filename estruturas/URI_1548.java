package estruturas;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI_1548 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            int num_alunos = sc.nextInt();

            ArrayList<SimpleEntry<Integer, Integer>> alunos = new ArrayList<>();

            for (int i = 0; i < num_alunos; i++) {
                int temp = sc.nextInt();
                SimpleEntry<Integer, Integer> sp = new SimpleEntry<>(temp, i);
                alunos.add(sp);
            }

            Collections.sort(alunos, (a, b) -> {
                if (a.getKey() > b.getKey()) return -1;
                else if (a.getKey() < b.getKey()) return 1;
                else return 0;
            });

            int count = 0;
            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getValue() == i) {
                    count++;
                }
            }

            System.out.println(count);

            n--;
        }
        sc.close();
    }
}

