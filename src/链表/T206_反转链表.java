package 链表;
/**
 * 反转链表
 * 
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 
 * 方法：递归和迭代
 * 
 * */
public class T206_反转链表 {
	class Solution {
	    public ListNode reverseList(ListNode head) {
	        if(head==null||head.next==null)return head;
	        ListNode newHead=reverseList(head.next);
	        head.next.next=head;
	        head.next=null;
	        return newHead;
	    }
	}
	class Solution2{
		public ListNode reverseList(ListNode head) {
			if (head == null || head.next == null) return head;
			ListNode newHead = null;
			while (head != null) {
				ListNode tmp = head.next;
				head.next = newHead;
				newHead = head;
				head = tmp;
			}
			
			return newHead;
	    }
	}
}
