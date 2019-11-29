package com.datastructures.linkedlist.singlylinkedlist;

/** Let us formulate the problem statement to understand the deletion process. Given a ‘key’, delete the first occurrence of this key in linked list.
        To delete a node from linked list, we need to do following steps.
        1) Find previous node of the node to be deleted.
        2) Change the next of previous node.
       3) Free memory for the node to be deleted. */


public class SinglyLinkedListDeleteNode {
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
        SinglyLinkedListDeleteNode singlyLinkedListDeleteNode=new SinglyLinkedListDeleteNode();

        singlyLinkedListDeleteNode.head=new Node(2);
        Node newNode=new Node(3);
        singlyLinkedListDeleteNode.head.next=newNode;
        singlyLinkedListDeleteNode.printList();
        singlyLinkedListDeleteNode.deleteNode(2);
        singlyLinkedListDeleteNode.printList();


    }


    private void deleteNode(int data){
        Node checkNode=head;
        Node prevNode=head;
        if(checkNode.data==data){
            head=checkNode.next;
            return;
        }
        while(checkNode!=null){
            if(checkNode.data==data){
                prevNode.next=checkNode.next;
                break;
            }
            prevNode=checkNode;
            checkNode=checkNode.next;
        }
    }

    private void printList(){
        Node node=head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
}
