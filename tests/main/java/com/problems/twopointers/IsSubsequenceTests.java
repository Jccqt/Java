package main.java.com.problems.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsSubsequenceTests {

	@Test
	void Example1() {
		// Arrange
		IsSubsequence solver = new IsSubsequence();
		
		// Act
		boolean result = solver.isSubsequence("abc", "ahbgdc");
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void Example2() {
		// Arrange
		IsSubsequence solver = new IsSubsequence();
		
		// Act
		boolean result = solver.isSubsequence("axc", "ahbgdc");
		
		// Assert
		assertFalse(result);
	}

}
