package com.datastructures.linkedlist.singlylinkedlist;

/**
 * Write a function which takes a list sorted in non-decreasing order and deletes any duplicate nodes from the list. The list should only be traversed once.
 * <p>
 * For example if the linked list is 11->11->11->21->43->43->60 then removeDuplicates() should convert the list to 11->21->43->60.
 */

public class SinglyLinkedListDeleteDuplicate {

    Node head;

    public static void main(String[] args) {
        SinglyLinkedListDeleteDuplicate singlyLinkedListDeleteDuplicate = new SinglyLinkedListDeleteDuplicate();
        singlyLinkedListDeleteDuplicate.push(1);
        singlyLinkedListDeleteDuplicate.push(2);
        singlyLinkedListDeleteDuplicate.push(3);
        singlyLinkedListDeleteDuplicate.push(3);
        singlyLinkedListDeleteDuplicate.push(3);
        singlyLinkedListDeleteDuplicate.push(4);
        singlyLinkedListDeleteDuplicate.push(4);
        singlyLinkedListDeleteDuplicate.printList();
        System.out.println("-------------after deleting duplicates-------");
        singlyLinkedListDeleteDuplicate.deleteDuplicateFromSorted();
    }

    private void deleteDuplicateFromSorted() {
        Node checkNode = head;
        while (checkNode != null) {
            Node temp = checkNode;
            while (temp != null && temp.data == checkNode.data) {
                temp = temp.next;
            }
            checkNode.next = temp;
            checkNode = checkNode.next;
        }

        printList();
    }

    private void push(int data) {
        Node newNode = new Node(data);
        Node addNode = head;
        while (addNode != null) {
            if (addNode.next == null) {
                addNode.next = newNode;
                return;
            }
            addNode = addNode.next;
        }
        if (addNode == null)
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

