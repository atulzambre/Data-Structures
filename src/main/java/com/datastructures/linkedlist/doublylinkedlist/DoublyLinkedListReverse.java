package com.datastructures.linkedlist.doublylinkedlist;

/**
 * Write a function to reverse a given Doubly Linked List
 */
public class DoublyLinkedListReverse {
    Node head;

    public static void main(String[] args) {
        DoublyLinkedListReverse doublyLinkedListReverse = new DoublyLinkedListReverse();

    }

    private void push(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else
            newNode.next = head;
    }

    private void printList() {
        Node checkNode = head;
        while (checkNode != null) {
            System.out.print("<-" + checkNode.data + "->");
            checkNode = checkNode.next;
        }
    }

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
}
