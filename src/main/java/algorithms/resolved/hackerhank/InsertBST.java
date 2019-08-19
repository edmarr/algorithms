package algorithms.resolved.hackerhank;

/**
 * https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
 *
 */
public class InsertBST {
	public static NodeInsert insert(NodeInsert root,int data) {
        
        if(root == null){
        	NodeInsert node = new NodeInsert(data);
            root = node;
        }else if (data > root.data) {
            root.right = insert(root.right , data);
        }else if (data < root.data){
            root.left = insert(root.left , data);
        }

    	return root;
    }
}


class NodeInsert {
	public NodeInsert(int data) {
		this.data = data;
	}
	int data;
	NodeInsert left;
	NodeInsert right;

}
