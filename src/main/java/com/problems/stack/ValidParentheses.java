package main.java.com.problems.stack;

import java.util.Stack;

// Problem: Given a string s containing just the characters '(', ')', '{', '}', '[', and ']',
// determine if the input string is valid.

// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.

// Example 1
// Input: s = "()"
// Output: true

// Example 2
// Input: s = "(){}[]"
// Output: true

// Example 3
// Input: s = "{]"
// Output = false

// Example 4
// Input: s = "({})"
// Output = true

public class ValidParentheses {
	
	// Time Complexity: O(n)
	// Space Complexity: O(n)
	public boolean IsValid(String s) {
		if(s.length() % 2 != 0) return false;
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		
		return stack.isEmpty();
	}
}
