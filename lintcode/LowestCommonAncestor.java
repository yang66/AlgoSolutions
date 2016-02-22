/*
 * Given the root and two nodes in a Binary Tree. Find the 
 * lowest common ancestor(LCA) of the two nodes.

The lowest common ancestor is the node with largest depth 
which is the ancestor of both nodes.

Example
For the following binary tree:

  4
 / \
3   7
   / \
  5   6
LCA(3, 5) = 4

LCA(5, 6) = 7

LCA(6, 7) = 7
 */
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class LowestCommonAncestor {

    /**
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        if (root == null || root == A || root == B) {
            return root;
        }
        if (lowestCommonAncestor(root.left, A, B) != null) {
            return lowestCommonAncestor(root.left, A, B);
        } else if (lowestCommonAncestor(root.right, A, B) != null) {
            return lowestCommonAncestor(root.right, A, B);
        }
        return root;
    }

/*****************************************************************************/

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        if (root == null || root == A || root == B) {
            return root;
        }
        if (find(root.left, A) && find(root.left, B)) {
            return lowestCommonAncestor(root.left, A, B);
        } else if (find(root.right, A) && find(root.right, B)) {
            return lowestCommonAncestor(root.right, A, B);
        }
        return root;
    }

    public boolean find(TreeNode root, TreeNode node) {
        if (root == null) {
            return false;
        }
        if (root == node) {
            return true;
        }
        return find(root.left, node) || find(root.right, node);
    }

}
