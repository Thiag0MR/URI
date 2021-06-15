package strings;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class URI_1273 {
    public static void main(String[] args) {
        int N;

        Scanner sc = new Scanner(System.in);

        boolean v = false;

        while (true) {
            N = sc.nextInt();
            if (N == 0) {
                break;
            } else {
                if (v) {
                    System.out.println();
                }
            }
        	sc.nextLine();

        	List<String> words = new LinkedList<>();
        	int max = 0;

        	for (int i = 0 ; i < N; i++) {
        		String str = sc.nextLine();
                words.add(str);
        		if (max < str.length()) {
        			max = str.length();
        		}
        	}

        	Iterator<String> it = words.iterator();
        	while (it.hasNext()) {
        		String str = it.next();
        		System.out.println(addEspace(max - str.length()) + str);
        	}
            if (v == false) {
                v = true;
            }
        }

        sc.close();
    }

	private static String addEspace(int length) {
		if (length == 0) {
			return "";
		} else {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < length; i++) {
				builder.append(" ");
			}
			return builder.toString();
		}

	}
}

