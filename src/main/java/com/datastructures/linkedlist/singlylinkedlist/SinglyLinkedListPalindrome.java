package com.datastructures.linkedlist.singlylinkedlist;

import java.util.Stack;

/**
 * Given a singly linked list of characters, write a function that returns true if the given list is a palindrome, else false.
 */
public class SinglyLinkedListPalindrome {
    Node head;

    public static void main(String[] args) {
        SinglyLinkedListPalindrome singlyLinkedListPalindrome = new SinglyLinkedListPalindrome();
        singlyLinkedListPalindrome.push(3);
        singlyLinkedListPalindrome.push(4);
        singlyLinkedListPalindrome.push(5);
        singlyLinkedListPalindrome.printList();
        singlyLinkedListPalindrome.isPalindromeStack();

    }

    private void isPalindromeStack() {
        Node checkNode = head;
        Stack<Integer> palindromeCheckStack = new Stack<>();
        while (checkNode != null) {
            palindromeCheckStack.push(checkNode.data);
            checkNode = checkNode.next;
        }
        checkNode = head;
        while (checkNode != null) {
            if (checkNode.data == palindromeCheckStack.peek())
                palindromeCheckStack.pop();

            checkNode = checkNode.next;
        }

        if (palindromeCheckStack.empty())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

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

    private void printList() {
        Node printNode = head;
        while (printNode != null) {
            System.out.print(" " + printNode.data);
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
