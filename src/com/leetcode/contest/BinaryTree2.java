package com.leetcode.contest;

public class BinaryTree2 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public TreeNode() {

        }
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        return diameterOfBinaryTree(root, 0);
    }

    public static int diameterOfBinaryTree(TreeNode root, int lnmax) {
        if (root == null)
            return lnmax;
        lnmax = diameterOfBinaryTree2(root, lnmax);
        lnmax = diameterOfBinaryTree(root.left, lnmax);
        lnmax = diameterOfBinaryTree(root.right, lnmax);
        return lnmax;
    }

    public static int diameterOfBinaryTree2(TreeNode root, int lnmax) {
        if (root == null)
            return lnmax;
        TreeNode tmplf = root.left;
        TreeNode tmprt = root.right;
        int lf = getLengthNode(tmplf);
        int rt = getLengthNode(tmprt);
        return Math.max(lf + rt, lnmax);
    }

    private static int getLengthNode(TreeNode tmp) {
        int lf = 0;
        int rt = 0;
        if (tmp != null) {
            lf = 1 + getLengthNode(tmp.left);
            rt = 1 + getLengthNode(tmp.right);
        } else {
            return 0;
        }
        return Math.max(lf, rt);
    }

    public static void main(String[] args) {
        TreeNode tn1 = new TreeNode();
        tn1.val = 1;
        TreeNode tn2 = new TreeNode();
        tn2.val = 2;
        TreeNode tn3 = new TreeNode();
        tn3.val = 3;
        TreeNode tn4 = new TreeNode();
        tn4.val = 4;
        TreeNode tn5 = new TreeNode();
        tn5.val = 5;
        tn1.left = tn2;
        tn1.right = tn3;
        tn2.left = tn4;
        tn2.right = tn5;
        int i = diameterOfBinaryTree(tn1);
        System.out.println(i);
    }
}
