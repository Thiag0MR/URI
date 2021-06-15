package estruturas;

import java.util.Scanner;

class CircularLinkedList {
    class Node {
        int value;
        Node next;
        Node previous;
    }
    Node head = null;
    Node tail = null;

    int size = 0;

    public void addTail(int value) {
        Node n = new Node();
        n.value = value;
        if (head == null) {
            head = n;
            tail = n;
            n.next = head;
            n.previous = head;
        }else {
            n.next = head;
            n.previous = tail;
            tail.next = n;
            tail = n;
            head.previous = tail;
        }
        size++;
    }
    public void remove(Node d) {
        if (head == null) {
            return;
        } else {
            Node before = d.previous;
            Node after = d.next;
            before.next = after;
            after.previous = before;
        }
        size--;
    }
}

public class URI_1119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            if ((n + k + m) == 0) {
                break;
            }
            CircularLinkedList list = new CircularLinkedList();
            for (int i = 0; i < n; i++) {
                list.addTail(i + 1);
            }
            CircularLinkedList.Node n1 = list.head;
            CircularLinkedList.Node n2 = list.tail;
            while (list.size != 0) {
                for (int i = 1; i < k; i++) {
                    n1 = n1.next;
                }
                for (int i = 1; i < m; i++) {
                    n2 = n2.previous;
                }
                if (n1.value == n2.value) {
                    sb.append(String.format("%3d,",n1.value));
                    CircularLinkedList.Node temp = n1;
                    n1 = n1.next;
                    n2 = n2.previous;
                    list.remove(temp);
                } else {
                    sb.append(String.format("%3d%3d,", n1.value, n2.value));
                    CircularLinkedList.Node temp = n1;
                    n1 = n1.next;
                    if (n1.value == n2.value) n1 = n1.next;
                    list.remove(temp);
                    temp = n2;
                    n2 = n2.previous;
                    list.remove(temp);
                }
            }
            System.out.println(sb.substring(0, sb.length()-1));
        }
        sc.close();
    }
}
