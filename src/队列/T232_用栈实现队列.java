package 队列;

import java.util.Stack;

/**
 * T232_用栈实现队列
 * 
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * 
 * 本来是很简单的东西，却因为一些小问题耽误了好久。
 * 
 * */
public class T232_用栈实现队列 {
	class MyQueue {
		Stack<Integer> outStack;
		Stack<Integer> inStack;
	    /** Initialize your data structure here. */
	    public MyQueue() {
	    	outStack=new Stack<>();
	    	inStack=new Stack<>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	    	if (outStack.isEmpty()) {
				inStack.push(x);
			}else {
				while(!outStack.isEmpty()) {
					inStack.push(outStack.pop());
				}
				inStack.push(x);
			}
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	    	if(!inStack.isEmpty()) {
	    		while(!inStack.isEmpty()) {
	    			outStack.push(inStack.pop());
	    		}
	    	}
	    	if(outStack.isEmpty())return -1;
	    	else {
				return outStack.pop();
			}
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	    	if(!inStack.isEmpty()) {
	    		while(!inStack.isEmpty()) {
	    			outStack.push(inStack.pop());
	    		}
	    	}
	    	if(outStack.isEmpty())return -1;
	    	else {
				return outStack.peek();
			}
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	    	return inStack.isEmpty()&&outStack.isEmpty();
	    }
	}
}
