package org.example.trees.binarytrees;

import java.util.Scanner;

public class BinaryTreeUse {

    public static void main(String [] args){
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> left = new BinaryTreeNode<>(3);
//        BinaryTreeNode<Integer> right = new BinaryTreeNode<>(4);
//        root.left = left;
//        root.right = right;
//        BinaryTreeNode<Integer> twoLeft = new BinaryTreeNode<>(5);
//        BinaryTreeNode<Integer> tworight = new BinaryTreeNode<>(6);
//
//        left.left = twoLeft;
//        left.right = tworight;
        //BinaryTreeNode<Integer> root=takeInput();
        BinaryTreeNode<Integer> root = takeInputNodeWise(true,1,false);
        // printTree(root);
        System.out.println("*************Print tree node wise******************");
        printTreeNodeWise(root);
        //BinaryTreeNode<Integer> newRoot = removeLeaf(root);
        System.out.println("**************Mirror tree*************************");
        BinaryTreeNode<Integer> newRoot = mirrorRoot(root);
        System.out.println("*************Print tree node wise******************");
        printTreeNodeWise(newRoot);
        System.out.println("***************Depth of tree***********************");
        printDepthOfTree(root,1);

    }

    protected static BinaryTreeNode<Integer> takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter root data");

        int rootData = scanner.nextInt();
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        if(rootData==-1){
            return null;
        }else{
            root.data=rootData;
        }
        root.left=takeInput();
        root.right=takeInput();
        return root;
    }

    protected static BinaryTreeNode<Integer> takeInputNodeWise(boolean isRoot,int parentData,boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data: ");
        }else{
            if(isLeft){
                System.out.println("Enter left of "+parentData);
            }else{
                System.out.println("Enter right of "+ parentData);
            }
        }
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if(rootData == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInputNodeWise(false,root.data,true);
        root.right = takeInputNodeWise(false,root.data,false);
        return root;
    }

    protected static void printTree(BinaryTreeNode<Integer> root) {
        //Base case if root is null return.
        if(root==null)
            return;

        System.out.println(root.data);
//        printTree(root.left);
//        printTree(root.right);
        printTreeNodeWise(root);
        printDepthOfTree(root,1);
    }

    public static void  printTreeNodeWise(BinaryTreeNode<Integer> root){
        //Base case
        if (root ==null){
            return ;
        }
        System.out.print(root.data+":");
        if(root.left!=null) {
            System.out.print("L "+root.left.data+" , ");
        }
        if(root.right!=null) {
            System.out.print("R "+root.right.data);
        }
        System.out.println();
        printTreeNodeWise(root.left);
        printTreeNodeWise(root.right);
    }


    public static void printDepthOfTree(BinaryTreeNode<Integer> root,int k){
        if(root==null)
            return;

        if(k==0){
            System.out.println(root.data);
            return;
        }

        printDepthOfTree(root.left,k-1);
        printDepthOfTree(root.right,k-1);
    }

    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        //Base case
        if(root==null){
            return null;
        }
        if(root.left==null && root.right == null){
            return null;
        }
        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }

    public static BinaryTreeNode<Integer> mirrorRoot(BinaryTreeNode<Integer> root){
        //Base case
        if(root == null){
            return null;
        }
        if(root.left == null && root.right ==null){
            return root;
        }

        BinaryTreeNode<Integer> tmpLeft = root.left;
        root.left = mirrorRoot(root.right);
        root.right = mirrorRoot(tmpLeft);
        return root;

    }
}
