package main.java.com.problems.arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

// Problem: Given an integer array nums, return true if any value appears 
// at least twice in the array, and return false if every element is distinct.

// Example 1
// Input: nums = [1,2,3,1]
// Output: true
// Explanation: The element 1 occurs at the indices 0 and 3.

// Example 2
// Input: nums = [1,2,3,4]
// Output: false
// Explanation: All elements are distinct
public class ContainsDuplicate {
	
	// Time Complexity: O(n)
	// Space Complexity: O(n)
	public boolean HasDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(!set.add(nums[i])) {
				return true;
			}
		}
		
		return false;
	}
}
