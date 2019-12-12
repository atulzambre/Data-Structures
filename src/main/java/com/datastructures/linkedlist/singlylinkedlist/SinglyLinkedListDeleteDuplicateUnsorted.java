package com.datastructures.linkedlist.singlylinkedlist;

/**
 * Write a removeDuplicates() function which takes a list and deletes any duplicate nodes from the list. The list is not sorted.
 * <p>
 * For example if the linked list is 12->11->12->21->41->43->21 then removeDuplicates() should convert the list to 12->11->21->41->43.
 */

public class SinglyLinkedListDeleteDuplicateUnsorted {

    Node head;

    public static void main(String[] args) {
        SinglyLinkedListDeleteDuplicateUnsorted singlyLinkedListDeleteDuplicateUnsorted = new SinglyLinkedListDeleteDuplicateUnsorted();
        singlyLinkedListDeleteDuplicateUnsorted.push(1);
        singlyLinkedListDeleteDuplicateUnsorted.push(2);
        singlyLinkedListDeleteDuplicateUnsorted.push(3);
        singlyLinkedListDeleteDuplicateUnsorted.push(3);
        singlyLinkedListDeleteDuplicateUnsorted.push(3);
        singlyLinkedListDeleteDuplicateUnsorted.push(3);
        singlyLinkedListDeleteDuplicateUnsorted.push(3);
        singlyLinkedListDeleteDuplicateUnsorted.push(3);
        singlyLinkedListDeleteDuplicateUnsorted.printList();
        System.out.println("\n---------after deletion----------");
        singlyLinkedListDeleteDuplicateUnsorted.deleteDuplicateUnsorted();
        singlyLinkedListDeleteDuplicateUnsorted.printList();
    }

    private void deleteDuplicateUnsorted() {
        Node checkNode = head;
        while (checkNode != null) {
            Node temp = checkNode.next;
            Node prev = checkNode;
            while (temp != null) {
                if (temp.data == checkNode.data) {
                    prev.next = temp.next;
                    temp = temp.next;
                } else {
                    temp = temp.next;
                    prev = prev.next;
                }
            }
            checkNode = checkNode.next;
        }
    }

    private void push(int data) {
        Node pushNode = head;
        Node newNode = new Node(data);
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

    private void printList() {
        Node printNode = head;
        while (printNode != null) {
            System.out.println(printNode.data + " ");
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
