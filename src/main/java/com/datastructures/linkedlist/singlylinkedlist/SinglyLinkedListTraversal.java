package com.datastructures.linkedlist.singlylinkedlist;

public class SinglyLinkedListTraversal {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedListTraversal singlyLinkedListTraversal=new SinglyLinkedListTraversal();
        singlyLinkedListTraversal.head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);



        singlyLinkedListTraversal.head.next=n2;
        n2.next=n3;
        n3.next=n4;

        singlyLinkedListTraversal.printList();

    }


    private void printList(){

        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }

    }
}
