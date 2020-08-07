package 链表;
/**
 * 删除链表中的节点
 * 
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 
 * 方法：由于只给了要删除的那个，所以我们把后面的都复制到前一位再删除最后一位即可。
 * 
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
