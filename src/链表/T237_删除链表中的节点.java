package 链表;
/**
 * 删除链表中的节点
 * 
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * */
public class T237_删除链表中的节点 {

class Solution{
	  public void deleteNode(ListNode node) {
	  while(node.next.next!=null) {
		   node.val=node.next.val;
		   node=node.next;
	  }
	  node.val=node.next.val;
	   node.next=node.next.next;  
	    }
}
}
