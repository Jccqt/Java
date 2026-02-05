package main.java.com.problems.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTests {

	@Test
	void Example1() {
		// Arrange
		ContainerWithMostWater solver = new ContainerWithMostWater();
		
		// Act
		int result = solver.maxArea(new int[] {1,8,6,2,5,4,8,3,7});
		
		// Assert
		assertEquals(49, result);
	}
	
	@Test
	void Example2() {
		// Arrange
		ContainerWithMostWater solver = new ContainerWithMostWater();
		
		// Act
		int result = solver.maxArea(new int[] {1,1});
		
		// Assert
		assertEquals(1, result);
	}

}
