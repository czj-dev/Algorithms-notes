package Leetcode;

public class TreeMinLevel {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int minDepth = Integer.MAX_VALUE;
        if (root.left != null) {
            minDepth = Math.min(minDepth(root.left), minDepth);
        }
        if (root.right != null) {
            minDepth = Math.min(minDepth(root.right), minDepth);
        }
        return minDepth + 1;
    }

    public static void main(String[] args) {
        TreeMinLevel tree = new TreeMinLevel();
        TreeNode node = new TreeNode(1);
        node.left = null;
        node.right = new TreeNode(2);
        int minDepth = tree.minDepth(node);
        System.out.println(minDepth);
    }
}