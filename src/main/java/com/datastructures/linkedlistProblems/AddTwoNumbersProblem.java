package com.datastructures.linkedlistProblems;

import java.util.Objects;

public class AddTwoNumbersProblem {
    public static void main(String[] args) {
        AddTwoNumbersProblem addTwoNumbersProblem=new AddTwoNumbersProblem();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        addTwoNumbersProblem.display(l1);


        //reverse
        ListNode prev = null;
        ListNode current = l1;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        l1=prev;
        addTwoNumbersProblem.display(l1);

    }
    public void display(ListNode l1){
        while(Objects.nonNull(l1)){
            System.out.print(l1.val+"->");
            l1=l1.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode checkNode=new ListNode();
        checkNode=l1;
    while(Objects.nonNull(checkNode)){
       ListNode temp=checkNode;
       checkNode=checkNode.next;
       checkNode.next=temp;
    }
    while(Objects.nonNull(checkNode)){
        System.out.println(checkNode.val+"->");
        checkNode=checkNode.next;
    }
    return null;
    }
}
