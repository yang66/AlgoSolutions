/*
 * Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 
respectively. Return 24.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                stack.push(node.left);
                stack.push(node.right);
                if (node.left != null && node.left.left == null 
                        && node.left.right == null) {
                    result += node.left.val;
                }
            }
        }
        return result;
    }

}
