package 链表;
/**
 * 环形链表
 * 
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * 
 * 知识点：
 * 
 * 快慢指针
 * 
 * */
public class T141_环形链表 {
	class Solution {
	    public boolean hasCycle(ListNode head) {
	        if(head==null||head.next==null) {
	        	return false;
	        }
	        ListNode fast=head.next,slow=head;
	        while(fast!=null&&fast.next!=null) {
	        	if(fast==slow) {
	        		return true;
	        	}
	        	fast=fast.next.next;
	        	slow=slow.next;
	        }
	       return false;
	        
	    }
	}
}
