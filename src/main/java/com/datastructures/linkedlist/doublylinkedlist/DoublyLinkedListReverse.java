package com.datastructures.linkedlist.doublylinkedlist;

/**
 * Write a function to reverse a given Doubly Linked List
 */
public class DoublyLinkedListReverse {
    Node head;

    public static void main(String[] args) {
        DoublyLinkedListReverse doublyLinkedListReverse = new DoublyLinkedListReverse();
        doublyLinkedListReverse.push(1);
        doublyLinkedListReverse.push(2);
        doublyLinkedListReverse.push(3);
        doublyLinkedListReverse.push(4);
        doublyLinkedListReverse.printList();
        System.out.println("\n---------------After Reversing-------------");
        doublyLinkedListReverse.reverse();
        doublyLinkedListReverse.printList();

    }

    private void reverse() {
        Node checkNode = head;
        while (checkNode != null) {
            Node temp = checkNode.prev;
            checkNode.prev = checkNode.next;
            checkNode.next = temp;
            head = checkNode;
            checkNode = checkNode.prev;

        }


    }

    private void push(int data) {
        Node newNode = new Node(data);
        Node checkNode = head;
        if (checkNode != null) {
            newNode.next = checkNode;
            checkNode.prev = newNode;
            head = newNode;
        } else
            head = newNode;
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
