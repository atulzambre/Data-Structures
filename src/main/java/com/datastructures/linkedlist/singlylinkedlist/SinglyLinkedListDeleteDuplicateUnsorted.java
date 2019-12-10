package com.datastructures.linkedlist.singlylinkedlist;

/**
 * Write a removeDuplicates() function which takes a list and deletes any duplicate nodes from the list. The list is not sorted.
 *
 * For example if the linked list is 12->11->12->21->41->43->21 then removeDuplicates() should convert the list to 12->11->21->41->43.
 */

public class SinglyLinkedListDeleteDuplicateUnsorted {

    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListDeleteDuplicateUnsorted singlyLinkedListDeleteDuplicateUnsorted=new SinglyLinkedListDeleteDuplicateUnsorted();
        singlyLinkedListDeleteDuplicateUnsorted.push(1);
        singlyLinkedListDeleteDuplicateUnsorted.push(2);
        singlyLinkedListDeleteDuplicateUnsorted.push(3);
        singlyLinkedListDeleteDuplicateUnsorted.printList();
    }

    private void deleteDuplicateUnsorted(){

    }

    private void push(int data){
        Node pushNode=head;
        Node newNode=new Node(data);
        while(pushNode!=null){
            if(pushNode.next==null) {
                pushNode.next = newNode;
                return;
            }
            pushNode=pushNode.next;
        }
        if(pushNode==null)
            head=newNode;
    }

    private void printList(){
        Node printNode=head;
        while(printNode!=null){
            System.out.println(printNode.data+" ");
            printNode=printNode.next;
        }
    }

}
