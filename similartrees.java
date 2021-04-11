package tree;

import java.util.ArrayList;

public class similartrees {
	   void helper(TreeNode root, ArrayList<Integer> list){
	        if(root == null){
	            return;
	        }
	        if(root.left == null && root.right == null){
	            list.add(root.val);
	        }        
	        helper(root.left, list);
	        helper(root.right, list);
	    }
	
	 public boolean leafSimilar(TreeNode root1, TreeNode root2) 
	     {
	        ArrayList<Integer> l1 = new ArrayList();
	        ArrayList<Integer> l2 = new ArrayList();
	        
	        helper(root1, l1);
	        helper(root2,l2);
	      
	        if(l1.size() != l2.size())
	        {
	            return false;
	        }
	      
	        for(int i = 0; i < l1.size(); i++){
	            if(l1.get(i) != l2.get(i)){
	                return false;
	            }
	        }
	        return true;
	    }
	  

}
