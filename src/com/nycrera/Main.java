package com.nycrera;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedListReverse listReverse = new LinkedListReverse();
        listReverse.head = new Node(85);
        listReverse.head.next = new Node(16);
        listReverse.head.next.next = new Node(5);
        listReverse.head.next.next.next = new Node(99);

        listReverse.printList(listReverse.head);

        System.out.println();

        listReverse.head = listReverse.reverse(listReverse.head);
        listReverse.printList(listReverse.head);

    }
}
