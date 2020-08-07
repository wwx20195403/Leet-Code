package 链表;
/**
 * 删除排序列表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * */

public class T83_删除排序列表中的重复元素 {
	class Solution {
		public ListNode deleteDuplicates(ListNode head) {
	        if(head==null){
	            return head;
	        }
	        ListNode newlist=head;
	        while(head!=null){
	            head.next=returnhead(head.next,head.val);//获得第二个有效节点
	            head=head.next;
	        }
	        return newlist;
		}
		public ListNode returnhead(ListNode head, int val){
		    	if (head==null) {
				return head;
				}else if(head.val!=val){
		            return head;
		        }
		    	return returnhead(head.next,val);
		}
}
}
