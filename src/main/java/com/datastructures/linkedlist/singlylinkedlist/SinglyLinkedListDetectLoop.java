package com.datastructures.linkedlist.singlylinkedlist;

public class SinglyLinkedListDetectLoop {
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
        SinglyLinkedListDetectLoop singlyLinkedListDetectLoop=new SinglyLinkedListDetectLoop();
        singlyLinkedListDetectLoop.head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);
        Node n7=new Node(7);

        singlyLinkedListDetectLoop.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n3;

        singlyLinkedListDetectLoop.detectLoop();


    }

    private void detectLoop(){
        Node slow_ptr=head;
        Node fast_ptr=head;

        while(fast_ptr!=null&&fast_ptr.next!=null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
            if(fast_ptr==slow_ptr){
                System.out.println("Loop detected");
                break;
            }

        }

    }
}
