package com.datastructures.linkedlist.doublylinkedlist;

/**
 * Find pairs with given sum in doubly linked list
 */
public class DoublyLinkedListSumPair {
    Node head;

    public static void main(String[] args) {
        DoublyLinkedListSumPair doublyLinkedListSumPair = new DoublyLinkedListSumPair();
        doublyLinkedListSumPair.push(1);
        doublyLinkedListSumPair.push(2);
        doublyLinkedListSumPair.push(3);
        doublyLinkedListSumPair.push(4);
        doublyLinkedListSumPair.printList();
        doublyLinkedListSumPair.checkSumPair(5);
    }

    private void checkSumPair(int sum) {
        Node firstPtr = head;
        if (firstPtr.next != null)

            while (firstPtr != null) {
                Node tempPtr = firstPtr.next;
                while (tempPtr != null) {
                    if (firstPtr.data + tempPtr.data == sum) {
                        System.out.print("\n Sum Pair is : " + firstPtr.data + " & " + tempPtr.data);
                    }
                    tempPtr = tempPtr.next;
                }
                firstPtr = firstPtr.next;
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
