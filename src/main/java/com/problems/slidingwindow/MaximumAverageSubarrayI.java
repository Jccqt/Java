package main.java.com.problems.slidingwindow;

// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value
// and return this value. Any answer with a calculation error less than 10^-5 will be accepted.

// Example 1
// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000

// Example 2
// Input: nums = [5], k = 1
// Output: 5.000
public class MaximumAverageSubarrayI {
	// Time complexity: O(N)
	// Space complexity: O(1)
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        double res = 0;

        for(int i = 0; i < k; i++){
            max += nums[i];
        }

        res = max / k;

        for(int i = k; i < nums.length; i++){
            max -= nums[i - k];
            max += nums[i];

            res = Math.max(max / k, res);
        }

        return res;
    }
}
