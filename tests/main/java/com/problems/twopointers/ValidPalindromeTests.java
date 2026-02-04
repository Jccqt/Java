package main.java.com.problems.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidPalindromeTests {

	@Test
	void Example1() {
		// Arrange
		ValidPalindrome solver = new ValidPalindrome();

		// Act
		boolean result = solver.IsPalindrome("A man, a plan, a canal: Panama");
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void Example2() {
		// Arrange
		ValidPalindrome solver = new ValidPalindrome();
		
		// Act
		boolean result = solver.IsPalindrome("race a car");
		
		// Assert
		assertFalse(result);
	}
	
	@Test
	void Example3() {
		// Arrange
		ValidPalindrome solver = new ValidPalindrome();
		
		// Act
		boolean result = solver.IsPalindrome(" ");
		
		assertTrue(result);
	}

}
