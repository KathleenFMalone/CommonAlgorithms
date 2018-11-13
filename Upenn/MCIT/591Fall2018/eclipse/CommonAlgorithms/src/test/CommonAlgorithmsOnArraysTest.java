package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.CommonAlgorithmsOnArrays;

public class CommonAlgorithmsOnArraysTest {
	
	CommonAlgorithmsOnArrays ca;
	
	@BeforeEach
	public void setUp() {
		ca=new CommonAlgorithmsOnArrays();
	}
	
	
	//Test purpose: test the findMax method works with negative numbers
	@Test
	public void findMaxTest1() {
		int[] testArray = {-1,-5,-9,-10};
		int result = ca.findMax(testArray);
		assertEquals(-1, result);
	}
	
	//Test purpose: test the findMin method works with numbers greater than 0
	@Test
	public void findMinTest1() {
		int[] testArray = {1,5,9,10};
		int result = ca.findMin(testArray);
		assertEquals(1, result);
	}
	
	
	//Test purpose: tests findAverage with all positive numbers
	@Test
	public void findAverageTest1() {
		int[] testArray = {1,5,9,10,5};
		int result = ca.findAverage(testArray);
		assertEquals(6, result);
	}

}
