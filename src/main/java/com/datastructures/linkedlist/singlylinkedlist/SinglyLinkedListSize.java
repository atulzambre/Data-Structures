package com.datastructures.linkedlist.singlylinkedlist;


/**
 * Write a function to count the number of nodes in a given singly linked list.
 */

public class SinglyLinkedListSize {

    Node head;

    public static void main(String[] args) {
        SinglyLinkedListSize singlyLinkedListSize = new SinglyLinkedListSize();
        singlyLinkedListSize.push(1);
        singlyLinkedListSize.push(2);
        singlyLinkedListSize.push(3);

        singlyLinkedListSize.linkedListSize();


    }

    private void linkedListSize() {
        int count = 0;
        while (head != null) {
            ++count;
            head = head.next;
        }

        System.out.println("Size of the Linked List : " + count);
    }

    private void push(int data) {
        SinglyLinkedListSize.Node last = new SinglyLinkedListSize.Node(data);

        SinglyLinkedListSize.Node checkNode = head;
        while (checkNode != null) {
            if (checkNode.next == null) {
                checkNode.next = last;
                break;
            }
            checkNode = checkNode.next;
        }
        if (head == null) {
            head = last;
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
