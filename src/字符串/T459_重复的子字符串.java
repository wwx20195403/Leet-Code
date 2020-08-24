package 字符串;

import java.util.Date;

/**
 * T459_重复的子字符串
 * 
 * https://leetcode-cn.com/problems/repeated-substring-pattern/
 * 
 */
public class T459_重复的子字符串 {
	public static void main(String[] args) {
		Solution solution=new Solution();
		System.out.println(solution.repeatedSubstringPattern(""));
	}
	
	
}

class Solution {
	public boolean repeatedSubstringPattern(String s) {
		return (s+s).substring(1,s.length()*2-1).contains(s);
	}
}