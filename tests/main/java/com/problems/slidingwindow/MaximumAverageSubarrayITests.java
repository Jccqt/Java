package main.java.com.problems.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumAverageSubarrayITests {

	@Test
	void Example1() {
		// Arrange
		MaximumAverageSubarrayI solver = new MaximumAverageSubarrayI();
		
		// Act
		double result = solver.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4);
		
		// Assert
		assertEquals(12.75, result);
	}
	
	@Test
	void Example2() {
		// Arrange
		MaximumAverageSubarrayI solver = new MaximumAverageSubarrayI();
		
		// Act
		double result = solver.findMaxAverage(new int[] {5}, 1);
		
		// Assert
		assertEquals(5.0, result);
	}

}
