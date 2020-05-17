package com.nycrera;

/**
 * Created by Alperen Asa
 * Date: 20.04.2020
 * Time: 09:29
 * Project Name: Reverse Linked List
 */

public class LinkedListReverse {

    Node head;

    Node reverse(Node node) {

        Node prev = null;
        Node current = node;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    void printList(Node node) {
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

}
