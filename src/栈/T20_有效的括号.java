package 栈;

import java.util.Stack;

/**
 * T20_有效的括号 
 * 
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 
 * */
public class T20_有效的括号 {
	class Solution {
	    public boolean isValid(String s) {
	    	Stack<Character> s1=new Stack<Character>();
	    	for(int i=0;i<s.length();i++) {
	    		char c=s.charAt(i);
	    		if(c=='{'||c=='['||c=='(') {
	    			s1.push(c);
	    		}else {
	    			if(s1.isEmpty()) {     
	    				return false;
	    			}else {
	    				 char left=s1.pop();
	    				if(left=='{'&&c!='}') return false;
	    		    	if(left=='['&&c!=']') return false;
	    		    	if(left=='('&&c!=')') return false;
	   
	    			}
	    		}  		
	    	}
	    	return s1.isEmpty();
	    }
	    
	}
	class Solution2 {
	    public boolean isValid(String s) {
	    	String newChar="";
	    	while(s.contains("{}")||s.contains("()")||s.contains("[]")) {
	    		s=s.replace("{}", newChar);
	    		s=s.replace("()", newChar);
	    		s=s.replace("[]", newChar);
	    	}
	    	return s.isEmpty();
	    }
	}
}
