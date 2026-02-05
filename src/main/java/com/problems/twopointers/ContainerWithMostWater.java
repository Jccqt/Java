package main.java.com.problems.twopointers;

// You are given an integer array height of length n. There are n vertical lines 
// drawn such that the two endpoints of ith line are (i,0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

// Example 1
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49

// Example 2
// Input: height = [1,1]
// Output: 1
public class ContainerWithMostWater {
	// Time complexity: O(N)
	// Space complexity: O(1)
	public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea, currentHeight * width);

            if(height[left] <= height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }
}
