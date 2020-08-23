package com.datastructures.tree;

import java.util.Objects;

public class PerfectBinaryTree {

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

//        root.right.left=new Node(6);
        root.right.right=new Node(7);

        if(isPerfect(root)){
            System.out.println("This is a perfect binary tree!");
        }

        else{
            System.out.println("this is not a perfect binary tree!");
        }
    }

    public static boolean isPerfect(Node node){
        int depth=getDepth(node);
        return isPerfect(node,depth,0);

    }

    private static boolean isPerfect(Node node, int depth, int level) {
        if(Objects.isNull(node))
            return true;

        if(Objects.isNull(node.left)&&Objects.isNull(node.right))
            return (depth==level+1);

        if(Objects.isNull(node.left)||Objects.isNull(node.right))
            return false;

        return (isPerfect(node.left,depth,level+1)&&isPerfect(node.right,depth,level+1));
    }

    private static int getDepth(Node node) {
        Node newNode=new Node();
        newNode=node;
        int depth=0;
        while(Objects.nonNull(newNode)){
            depth++;
            newNode=newNode.left;
        }
        return depth;
    }

}
