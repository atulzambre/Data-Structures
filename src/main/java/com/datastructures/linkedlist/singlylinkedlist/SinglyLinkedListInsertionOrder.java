package com.datastructures.linkedlist.singlylinkedlist;

public class SinglyLinkedListInsertionOrder {

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
        SinglyLinkedListInsertionOrder singlyLinkedListInsertionOrder=new SinglyLinkedListInsertionOrder();
        singlyLinkedListInsertionOrder.addFront(3);
        singlyLinkedListInsertionOrder.addFront(4);
        singlyLinkedListInsertionOrder.addFront(5);


        singlyLinkedListInsertionOrder.addLast(10);

        singlyLinkedListInsertionOrder.addAfter(4,15);
        singlyLinkedListInsertionOrder.printList();

    }


    private void addFront(int data){
        Node head=new Node(data);
        head.next=this.head;
        this.head=head;
    }

    private void addLast(int data){
        Node last=new Node(data);

        Node checkNode=head;
        while(checkNode!=null){
            if(checkNode.next==null) {
                checkNode.next = last;
                break;
            }
            checkNode=checkNode.next;
        }
        if(head==null){
            head=last;
        }
    }

    private void addAfter(int afterData,int data){
        Node node=new Node(data);
        Node checkNode=head;
        while(checkNode!=null){
            if(checkNode.data==afterData){
                node.next=checkNode.next;
                checkNode.next=node;
                break;
            }
            checkNode=checkNode.next;

        }
        if(head==null){
            head=node;
        }
    }

    private void printList(){
        Node printNode=head;
        while(printNode!=null){
            System.out.println(printNode.data);
            printNode=printNode.next;
        }

    }
}
