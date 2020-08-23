package com.datastructures.tree;

import java.util.Objects;

public class BinarySearchTree {
    Node root;
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insertKey(8);
        binarySearchTree.insertKey(3);
        binarySearchTree.insertKey(1);
        binarySearchTree.insertKey(6);
        binarySearchTree.insertKey(7);
        binarySearchTree.insertKey(10);
        binarySearchTree.insertKey(14);
        binarySearchTree.insertKey(4);
        binarySearchTree.insertKey(5);
        binarySearchTree.inOrder(binarySearchTree.root);

        System.out.println("after delete");
        binarySearchTree.deleteKey(8);
        binarySearchTree.inOrder(binarySearchTree.root);
    }

    public void insertKey(int key){
        root=insertKey(root,key);
    }

    private Node insertKey(Node root, int key) {
        if(Objects.isNull(root)){
            root=new Node(key);
            return root;
        }

        if(key< root.item){
            root.left=insertKey(root.left,key);
        }
        else if(key>root.item){
            root.right=insertKey(root.right,key);
        }

        return root;
    }

    private void inOrder(Node node){

        if(Objects.isNull(node)){
            return;
        }
        inOrder(node.left);
        System.out.print(node.item+"->");
        inOrder(node.right);
    }

    private void deleteKey(int key){
        root=deleteKey(root,key);
    }

    private Node deleteKey(Node root, int key) {
        if(Objects.isNull(root)){
            return root;
        }
        if(key< root.item){
            root.left=deleteKey(root.left,key);
        }
        else if(key>root.item){
            root.right=deleteKey(root.right,key);
        }
        else{
            //check if node with one child or no child
            if(Objects.isNull(root.left)){
                return root.right;
            }
            else if(Objects.isNull(root.right)){
                return root.left;
            }

            root.item=minVal(root.right);
            root.right=deleteKey(root.right,root.item);
        }
        return root;

    }

    private int minVal(Node root) {
        int min=root.item;
        while(Objects.nonNull(root.left)){
            min=root.left.item;
            root=root.left;
        }
        return min;
    }
}
