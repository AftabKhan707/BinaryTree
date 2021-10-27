package tree;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
 }


public class inorder {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new LinkedList<Integer>();
		
		if (root == null)
			return new LinkedList<Integer>();

		Stack<TreeNode> st = new Stack<TreeNode>();
		
		TreeNode curr = root;
		while (curr != null || !st.isEmpty()) {
			
			while (curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			
			curr = st.pop(); 
			res.add(curr.val); 
			curr = curr.right; 
		}
		return res;
	}

}
