package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		
		String[] stringArray = {"an" , "qwerty","Many"," entries"," in"," our"," dictionaries ","include"," illustrations"," to"," help ","expand"," your ","vocabulary" };
		assertEquals(4,_00_LinearSearch.linearSearch (stringArray," in"));
		assertEquals(5,_00_LinearSearch.linearSearch (stringArray," our"));
		assertEquals(7,_00_LinearSearch.linearSearch (stringArray,"include"));
		assertEquals(-1,_00_LinearSearch.linearSearch (stringArray,"ree"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] inta = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		assertEquals(11,_01_BinarySearch.binarySearch(inta, 0, inta.length-1, 12));
		assertEquals(1,_01_BinarySearch.binarySearch(inta, 0, inta.length-1, 2));
		assertEquals(2,_01_BinarySearch.binarySearch(inta, 0, inta.length-1, 3));
		assertEquals(-1,_01_BinarySearch.binarySearch(inta, 0, inta.length-1, 146));
		
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] inta = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		assertEquals(11,_01_BinarySearch.binarySearch(inta, 0, inta.length-1, 12));
		assertEquals(1,_01_BinarySearch.binarySearch(inta, 0, inta.length-1, 2));
		assertEquals(2,_01_BinarySearch.binarySearch(inta, 0, inta.length-1, 3));
		assertEquals(-1,_01_BinarySearch.binarySearch(inta, 0, inta.length-1, 542));
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] inta = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,34,41,45,47,49,51,53,55,65,69,71,78,91,93,94,95,96,97,98,99,100,213,432,654,783,856,953,12345678};
		assertEquals(11,_01_BinarySearch.binarySearch(inta, 0, inta.length, 12));
		assertEquals(39,_01_BinarySearch.binarySearch(inta, 0, inta.length, 100));
		assertEquals(2,_01_BinarySearch.binarySearch(inta, 0, inta.length, 3));
		assertEquals(-1,_01_BinarySearch.binarySearch(inta, 0, inta.length, 5553));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
