package algorithms.resolved.hackerhank;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 *
 */

class NodeLevel {
	int data;
	NodeLevel left;
	NodeLevel right;

	NodeLevel(int data) {
		this.data = data;
	}
}

public class LevelOrder {

	public static void levelOrder(NodeLevel root) {
		Queue<NodeLevel> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			NodeLevel node = queue.poll();
			System.out.print(node.data);

			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}

	}

	public static NodeLevel insert(NodeLevel root, int data) {
		if (root == null) {
			return new NodeLevel(data);
		} else {
			NodeLevel cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {

		NodeLevel node = new NodeLevel(1);
		insert(node, 2);
		insert(node, 5);
		insert(node, 3);
		insert(node, 6);
		insert(node, 4);
		new LevelOrder().levelOrder(node);
	}

}
