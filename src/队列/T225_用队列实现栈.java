package 队列;
/**
 * 
 * T225_用队列实现栈
 * 
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 * 
 * */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class T225_用队列实现栈 {
	
	class MyStack {
		Queue<Integer> queue;
	    /** Initialize your data structure here. */
	    public MyStack() {
	    	queue=new LinkedList<Integer>();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	    	queue.add(x);
	    	for(int i=1;i<queue.size();i++) {
	    		queue.add(pop());
	    	}
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	    	return queue.remove();
	    }
	    
	    /** Get the top element. */
	    public int top() {
	    	return queue.peek();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	    	return queue.isEmpty();
	    }
	}
}
