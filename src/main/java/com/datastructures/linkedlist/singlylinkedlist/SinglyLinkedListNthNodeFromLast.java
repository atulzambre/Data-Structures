package com.datastructures.linkedlist.singlylinkedlist;

/** *
 Given a Linked List and a number n, write a function that returns the value at the n’th node from the end of the Linked List.
 */

public class SinglyLinkedListNthNodeFromLast {

    Node head;

    public static class Node{
        int data;
        Node next=null;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListNthNodeFromLast singlyLinkedListNthNodeFromLast=new SinglyLinkedListNthNodeFromLast();
        singlyLinkedListNthNodeFromLast.push(1);
        singlyLinkedListNthNodeFromLast.push(2);
        singlyLinkedListNthNodeFromLast.push(3);
        singlyLinkedListNthNodeFromLast.push(4);
        singlyLinkedListNthNodeFromLast.printList();
        singlyLinkedListNthNodeFromLast.getNthFromLast(2);
    }

    private void getNthFromLast(int nth){
        int size=size();
        int getNodeCount=0;
        Node getNode=head;
        if(size-nth>=0){
            int nthLast=size-nth;
            while(getNode!=null){

                if(getNodeCount==nthLast){
                    System.out.println(getNode.data);
                }
                getNodeCount++;
                getNode=getNode.next;

            }
        }
    }

    private int size(){
        int count=0;
        Node sizeNode=head;
        while(sizeNode!=null){
            ++count;
            sizeNode=sizeNode.next;
        }

        return count;

    }

    private void printList(){
        Node printNode=head;
        while(printNode!=null){
            System.out.println(printNode.data);
            printNode=printNode.next;
        }
    }

    private void push(int data){
        Node newNode = new Node(data);
        Node checkNode=head;

        while(checkNode!=null){
            if(checkNode.next==null){
                checkNode.next=newNode;
                return;
            }
            checkNode=checkNode.next;
        }
        if(checkNode==null)
            head=newNode;

    }
}
