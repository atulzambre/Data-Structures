package com.datastructures.tree;

import java.util.Objects;

public class FullBinaryTree {

    Node root;

    // Check for Full Binary Tree
    boolean isFullBinaryTree(Node node) {
        if(Objects.isNull(node))
            return true;

        if(Objects.isNull(node.left)&&Objects.isNull(node.right))
            return true;

        if(Objects.nonNull(node.left)&&Objects.nonNull(node.right)){
            return (isFullBinaryTree(node.left)&&isFullBinaryTree(node.right));
        }

        return false;
    }

    public static void main(String args[]) {
        FullBinaryTree tree = new FullBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        if (tree.isFullBinaryTree(tree.root))
            System.out.print("The tree is a full binary tree");
        else
            System.out.print("The tree is not a full binary tree");
    }
}
