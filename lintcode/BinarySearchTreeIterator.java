/*
 * Design an iterator over a binary search tree with the following rules:

Elements are visited in ascending order (i.e. an in-order traversal)
next() and hasNext() queries run in O(1) time in average.
Example
For the following binary search tree, in-order traversal by using iterator is 
[1, 6, 10, 11, 12]

   10
 /    \
1      11
 \       \
  6       12

Challenge
Extra memory usage O(h), h is the height of the tree.

Super Star: Extra memory usage O(1)
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
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */
public class BinarySearchTreeIterator {

}

class BSTIterator {

    Stack<TreeNode> stack;
    TreeNode cur;
    List<TreeNode> list;
    int index;

    //@param root: The root of binary tree.
    public BSTIterator(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        cur = root;
        index = 0;
        list = new LinkedList<TreeNode>();
        iterator(root, list);
    }

    public void iterator(TreeNode root, List<TreeNode> list) {
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            cur = node.right;
            list.add(node);
        }
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        return index < list.size();
    }

    //@return: return next node
    public TreeNode next() {
        if (list.size() == 0) {
            return null;
        }
        return list.get(index++);
    }

}




class BSTIterator {

    Stack<TreeNode> stack;
    TreeNode cur;

    //@param root: The root of binary tree.
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        cur = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }

    //@return: return next node
    public TreeNode next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        TreeNode node = stack.pop();
        cur = node.right;
        return node;
    }

}
