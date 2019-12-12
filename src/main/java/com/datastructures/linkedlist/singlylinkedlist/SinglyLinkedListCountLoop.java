package com.datastructures.linkedlist.singlylinkedlist;

/**
 * Write a function detectAndCountLoop() that checks whether a given Linked List contains loop and if loop is present then returns count of nodes in loop. For example, loop is present in below linked list and length of loop is 4. If loop is not present, then function should return 0.
 */
public class SinglyLinkedListCountLoop {
    Node head;

    public static void main(String[] args) {
        SinglyLinkedListCountLoop singlyLinkedListCountLoop = new SinglyLinkedListCountLoop();

        singlyLinkedListCountLoop.head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        singlyLinkedListCountLoop.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n3;

        singlyLinkedListCountLoop.detectLoopCount();
    }

    private void detectLoopCount() {
        Node slow_ptr = head;
        Node fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
            if (fast_ptr == slow_ptr) {
                System.out.print("Loop Count is :" + countLoop(slow_ptr));
                break;
            }

        }

    }

    private int countLoop(Node slow_ptr) {
        Node count_ptr = slow_ptr.next;
        int count = 1;

        while (count_ptr != slow_ptr) {
            count_ptr = count_ptr.next;
            count++;
        }
        return count;
    }

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
