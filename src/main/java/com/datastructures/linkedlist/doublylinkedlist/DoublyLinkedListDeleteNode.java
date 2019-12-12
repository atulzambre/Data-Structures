package com.datastructures.linkedlist.doublylinkedlist;

/**
 * Write a function to delete a given node in a doubly linked list.
 */
public class DoublyLinkedListDeleteNode {
    Node head;

    public static void main(String[] args) {
        DoublyLinkedListDeleteNode doublyLinkedListDeleteNode = new DoublyLinkedListDeleteNode();
        doublyLinkedListDeleteNode.push(1);
        doublyLinkedListDeleteNode.push(2);
        doublyLinkedListDeleteNode.push(3);
        doublyLinkedListDeleteNode.printList();
        System.out.println("\n------------after Deleting--------- ");
        doublyLinkedListDeleteNode.deleteNode(1);
        doublyLinkedListDeleteNode.printList();
    }

    private void deleteNode(int data) {
        Node checkNode = head;
        if (head.data == data) {
            head = head.next;
            return;
        }
        while (checkNode != null) {
            if (checkNode.data == data && checkNode.next == null) {
                checkNode.prev.next = null;
                break;
            } else if (checkNode.data == data) {
                checkNode.prev.next = checkNode.next;
                checkNode.next.prev = checkNode.prev;
                break;
            }
            checkNode = checkNode.next;
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
        Node printNode = head;
        while (printNode != null) {
            System.out.print("<-" + printNode.data + "->");
            printNode = printNode.next;
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
