package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * T226_翻转二叉树
 * 
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * */
public class T226_翻转二叉树 {
	class Solution {
	    public TreeNode invertTree(TreeNode root) {
	    	TreeNode temp=null;
	    	if(root==null) return null;
	    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
	    	queue.offer(root);
	    	while(!queue.isEmpty()) {
	    		TreeNode node= queue.poll();
	    		if(node.left!=null) {
	    		queue.offer(node.left);
	    		}
	    		if(node.right!=null) {
	    			queue.offer(node.right);
	    		}
	    		 temp=node.left;
	    		node.left=node.right;
	    		node.right=temp;
	    	}
	    	return root;
	    }
	}
}
