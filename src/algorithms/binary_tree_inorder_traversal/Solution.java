package algorithms.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<>();
    	
    	TreeNode nowTreeNode = root;
    	
    	while (nowTreeNode.left != null) {
			nowTreeNode = root.left;
		}
    	list.add(nowTreeNode.val);
    	
    	
    	
    	
    	
    	
    	
    	return list;
    }

}
