package algorithms.resolved.hackerhank;

class Node {
	int data;
	Node left;
	Node right;

}

/**
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 *
 */

public class HeightBinaryTree {
	public int height(Node root) {
		if (root == null) {
			return -1;
		} else {
			return 1 + Math.max(height(root.left), height(root.right));
		}
	}

}
