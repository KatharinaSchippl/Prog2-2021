package aufgaben.aufgabe4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class SingleNumberTestklasse 
{
	int [] nums = {5,1,2,1,2};
	int [] nums1 = {1,2,1,2};
	int [] nums2 = {1};
	
	@Test
	void testSingleNumber() 
	{
		System.out.println("Test1: ");
		assertTrue(1 == SingleNumber.singleNumber(nums2),"Input: [1] Expected output: 1");
		System.out.println("Test2: ");
		assertTrue(5 == SingleNumber.singleNumber(nums),"Input: [5,1,2,1,2] Expected output: 5");
		System.out.println("Test3: ");
		assertTrue(-1==SingleNumber.singleNumber(nums1),"Input: [1,2,1,2] Expected output: -1");
		System.out.println("Test4: ");
		assertFalse(6==SingleNumber.singleNumber(nums), "Input: [5,1,2,1,2] Expected output: 5");	
		System.out.println("Test5: ");
		assertEquals(5, SingleNumber.singleNumber(nums), "Input: [5,1,2,1,2] Expected output: 5");
	}
	

		

}
