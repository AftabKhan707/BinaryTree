package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
public class zigzag {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		int a = 1;
		LinkedList<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> res = new ArrayList<>();

		queue.add(root);
		while (queue.size() != 0) {
			LinkedList<Integer> list = new LinkedList<>();
			

				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode r = queue.removeFirst();
					if (r.left != null)
						queue.addLast(r.left);
					if (r.right != null)
						queue.addLast(r.right);

				if(a%2!=0)
					list.add(r.val);
				else
					list.addFirst(r.val);

				
			}
				res.add(list);
				a++;
		
		}
		return res;
	}

}
