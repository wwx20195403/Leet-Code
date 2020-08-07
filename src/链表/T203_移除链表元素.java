package 链表;
/**
 *移除链表元素
 * 
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * */
public class T203_移除链表元素 {
	class Solution {
	    public ListNode removeElements(ListNode head, int val) {
	        head=returnhead(head,val);//获得第一个有效节点
	        if(head==null){
	            return head;
	        }
	        ListNode newlist=head;
	        while(head!=null){
	            head.next=returnhead(head.next,val);//获得第二个有效节点
	            head=head.next;//移动head前往
	        }
	        return newlist;

	    }
	    //给一个节点返回有效值所在节点
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
