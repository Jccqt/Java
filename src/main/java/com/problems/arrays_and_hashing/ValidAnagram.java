package main.java.com.problems.arrays_and_hashing;

// Problem: Given two strings s and t, return true if t is an anagram of s, and false otherwise

// Example 1
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2
// Input: s = "rat", t = "car"
// Output: false

public class ValidAnagram {
	
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public boolean IsAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
		
		int[] char_count = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			char_count[s.charAt(i) - 'a']++;
			char_count[t.charAt(i) - 'a']--;
		}
		
		for(int count : char_count) {
			if(count != 0) {
				return false;
			}
		}
		
		return true;
	}
}
