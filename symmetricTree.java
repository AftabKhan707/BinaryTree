package tree;

public class symmetricTree {
	
	public boolean isSymmetric(TreeNode root) {
        return mirror(root, root);
    }
	
	  public static boolean mirror(TreeNode p1 , TreeNode p2){
	        if(p1 == null && p2 == null) return true;
	     
	        if(p1 != null && p2 != null && p1.val == p2.val)
	        {
	               if(mirror(p1.left, p2.right) && mirror(p1.right, p2.left)) return true;
	        }
	        
	        return false;
	    }
	    
	    

}
