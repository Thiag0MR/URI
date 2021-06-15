package estruturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1252 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == 0 && m == 0) {
                System.out.println(n + " " + m);
                break;
            }

            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                numbers.add (sc.nextInt());
            }

            numbers.sort((a,b) -> {
                if (a % m > b % m) {
                    return 1;
                }else if (a % m < b % m){
                    return -1;
                }else {
                    int aPar = a % 2;
                    int bPar = b % 2;
                    if (aPar == 0 && bPar == 0) {
                        if (a > b) return 1;
                        else if (b > a) return -1;
                        else return 0;
                    } else if (aPar != 0 && bPar != 0) {
                        if (a > b) return -1;
                        else if (b > a) return 1;
                        else return 0;
                    } else {
                        if (aPar == 0 && bPar != 0) {
                            return 1;
                        }else if (aPar != 0 && bPar == 0) {
                            return -1;
                        }else {
                            return 0;
                        }
                    }
                }
            });

            System.out.println(n + " " + m);
            numbers.forEach(System.out::println);
        }
        sc.close();
    }
}
