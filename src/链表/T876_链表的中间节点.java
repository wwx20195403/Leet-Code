package 链表;
/**
 * 链表的中间节点
 * 
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * 
 * 解法：快慢指针
 * 使用两个指针变量，刚开始都位于链表的第 1 个结点，一个永远一次只走 1 步，
 * 一个永远一次只走 2 步，一个在前，一个在后，同时走。这样当快指针走完的时候，
 * 慢指针就来到了链表的中间位置。
 * */


public class T876_链表的中间节点 {
	class Solution {
		   public ListNode middleNode(ListNode head) {
		        if (head == null) {
		            return null;
		        }
		        ListNode slow = head;
		        ListNode fast = head;

		        while (fast != null && fast.next != null) {
		            slow = slow.next;
		            fast = fast.next.next;
		        }
		        return slow;
		    }

		}
}
