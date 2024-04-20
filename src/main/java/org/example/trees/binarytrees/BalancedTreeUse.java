package org.example.trees.binarytrees;

public class BalancedTreeUse extends BinaryTreeUse {
    public static void main(String[] args){
        BinaryTreeNode<Integer> root = takeInputNodeWise(true,1,false);
        printTreeNodeWise(root);

        boolean istreeBalance = isTreeBalanced(root);
    }

    private static boolean isTreeBalanced(BinaryTreeNode<Integer> root) {
        //A tree is set to be balanced if its difference between left tree and right tree is less than or equal to 1. leftTree - rightTree <=1
        //Base case if root is null return true
        if(root==null){
            return true;
        }
        int leftHeight=0;
        int rightHeight=0;
        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        boolean leftBalanced = isTreeBalanced(root.left);
        boolean rightBalanced = isTreeBalanced(root.right);
        return leftBalanced && rightBalanced;
    }

    private int height(BinaryTreeNode<Integer> root){
        if(root==null)
            return 0;

        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return 1+Math.max(leftheight,rightheight);
    }
}
