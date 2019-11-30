package com.datastructures.linkedlist.singlylinkedlist;

/**
 * Given a singly linked list and a position, delete a linked list node at the given position.
 * <p>
 * Example:
 * <p>
 * Input: position = 1, Linked List = 8->2->3->1->7
 * Output: Linked List =  8->3->1->7
 * <p>
 * Input: position = 0, Linked List = 8->2->3->1->7
 * Output: Linked List = 2->3->1->7
 */

public class SinglyLinkedListDeletePos {

    Node head;

    public static void main(String[] args) {
        SinglyLinkedListDeletePos singlyLinkedListDeletePos = new SinglyLinkedListDeletePos();
        singlyLinkedListDeletePos.head = new Node(1);
        Node newNode = new Node(4);
        singlyLinkedListDeletePos.head.next = newNode;
        singlyLinkedListDeletePos.printList();
        singlyLinkedListDeletePos.deletePOS(1);
        singlyLinkedListDeletePos.printList();

    }

    private void deletePOS(int pos) {
        int posCount = 0;

        Node checkNode = head;
        Node prevNode = head;
        if (pos == 0) {
            head = head.next;
            return;
        }
        while (checkNode != null) {
            if (posCount == pos) {
                prevNode.next = checkNode.next;
                break;
            }
            prevNode = checkNode;
            checkNode = checkNode.next;
            posCount++;
        }
    }

    private void printList() {
        Node printNode = head;
        while (printNode != null) {
            System.out.println(printNode.data);
            printNode = printNode.next;
        }
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
