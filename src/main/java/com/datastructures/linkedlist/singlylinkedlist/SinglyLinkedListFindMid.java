package com.datastructures.linkedlist.singlylinkedlist;

/**
 * Given a singly linked list, find middle of the linked list. For example, if given linked list is 1->2->3->4->5 then output should be 3.
 * <p>
 * If there are even nodes, then there would be two middle nodes, we need to print second middle element. For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
 */

public class SinglyLinkedListFindMid {

    Node head;

    public static void main(String[] args) {

        SinglyLinkedListFindMid singlyLinkedListFindMid = new SinglyLinkedListFindMid();
        singlyLinkedListFindMid.push(1);
        singlyLinkedListFindMid.push(2);
        singlyLinkedListFindMid.push(3);
        singlyLinkedListFindMid.push(4);
        singlyLinkedListFindMid.push(5);
        singlyLinkedListFindMid.push(6);
        singlyLinkedListFindMid.printList();
        singlyLinkedListFindMid.findMidNodeMethod1();

    }

    private void findMidNodeMethod1() {
        Node oneStep = head;
        Node twoStep = head;
        while (twoStep != null && twoStep.next != null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
        }
        System.out.println("Middle Of the Linked List : " + oneStep.data);

    }

    private void printList() {
        Node printNode = head;
        while (printNode != null) {
            System.out.print(printNode.data);
            printNode = printNode.next;
        }
    }

    private void push(int data) {
        Node newNode = new Node(data);
        Node pushNode = head;
        while (pushNode != null) {
            if (pushNode.next == null) {
                pushNode.next = newNode;
                return;
            }
            pushNode = pushNode.next;
        }
        if (pushNode == null)
            head = newNode;
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