package com.datastructures.tree;

import java.util.Objects;

public class BinaryTree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Inorder Traversal");
        inorderTraversal(root);

        System.out.println("\n Preorder Traversal");
        preorderTraversal(root);

        System.out.println("\n Postorder Traversal");
        postorderTraversal(root);
    }

    private static void inorderTraversal(Node root){
        if(Objects.isNull(root))
            return;

        inorderTraversal(root.left);
        System.out.print(root.item+"->");
        inorderTraversal(root.right);
    }

    public static void preorderTraversal(Node root){
        if(Objects.isNull(root))
            return;
        System.out.print(root.item+"->");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void postorderTraversal(Node root){
        if(Objects.isNull(root))
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.item+"->");

    }


    }

