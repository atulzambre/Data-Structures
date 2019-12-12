package com.datastructures.linkedlist.doublylinkedlist;

public class DoublyLinkedListInsertion {

    Node head;

    public static void main(String[] args) {
        DoublyLinkedListInsertion doublyLinkedListInsertion = new DoublyLinkedListInsertion();
        doublyLinkedListInsertion.insertFront(1);
        doublyLinkedListInsertion.insertFront(2);
        doublyLinkedListInsertion.insertFront(3);
        doublyLinkedListInsertion.insertAfter(5, 2);
        doublyLinkedListInsertion.insertLast(7);
        doublyLinkedListInsertion.printList();
    }

    private void insertLast(int data) {
        Node newNode = new Node(data);
        Node checkNode = head;
        while (checkNode != null) {
            if (checkNode.next == null) {
                checkNode.next = newNode;
                newNode.prev = checkNode;
                break;
            }
            checkNode = checkNode.next;
        }
    }

    private void insertFront(int data) {
        Node newNode = new Node(data);
        Node checkNode = head;
        if (checkNode == null)
            head = newNode;
        else {
            checkNode.prev = newNode;
            newNode.next = checkNode;
            head = newNode;

        }
    }

    private void insertAfter(int data, int nodeData) {
        Node newNode = new Node(data);
        Node checkNode = head;
        while (checkNode != null) {
            if (checkNode.data == nodeData) {
                newNode.next = checkNode.next;
                checkNode.next = newNode;

            }
            checkNode = checkNode.next;
        }
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
