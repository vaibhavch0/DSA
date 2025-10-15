package trees;

import java.util.*;

    class Node {
        int data;
        Node left;
        Node right;


        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public class trees{
    public List<Integer> createpreorder( Node root){
        List<Integer>list=new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }

        preorder(list,root);
        return list;
    }
    public void preorder(List<Integer>list,Node root){
        if(root==null){
            return;
        }
        list.add(root.data);
        preorder(list,root.left);
        preorder(list,root.right);
    }


    public static void main(String[] args){
        trees t= new trees();
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> result = t.createpreorder(root);
        System.out.println("Preorder Traversal: " + result);


    }

}
//94 . Binary Tree preorder Traversal
/*
 * is code  m hmne preorder traversal krwaya h  
 * preorder m root left right hota h
 * agr root null h to empty list return krdo
 * fir preorder function m root ka data list m add krdo
 * fir left subtree m jao fir right subtree m jao   
 */