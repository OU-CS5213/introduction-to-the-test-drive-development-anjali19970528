import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AWSTest {

	private static final int FILLER_VALUE = Integer.MIN_VALUE;
	private int[] original={1, 2, 3};
	AWS originalAWS;
	
	@BeforeEach
	void setUp() throws Exception {
		 originalAWS = new AWS(this.original);
	}

	@Test
	void testGetValues() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValues() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAWS() {
		int[] expected = {1, 2, 3};
		int[] x = {1, 2, 3};
		AWS aws = new AWS(x);
		x[1] = 100;
		
		int[] actual = aws.getValues();
		assertEquals(actual[0], expected[0]);
		assertEquals(actual[1], expected[1]);
	}
	
	@Test
	void testRemove() {
		int[] x = {1, 2, 3};
		AWS aws = new AWS(x);
		
		int value = aws.remove(-1);
		int expected = FILLER_VALUE;
		assertEquals(expected, value);
		
		 value = aws.remove(x.length + 10);
		expected = FILLER_VALUE;
		assertEquals(expected, value);
		
		value = aws.remove(0);
		assertEquals(x[0], value);
		
		int[] r = aws.getValues();
		value = r[r.length - 1];
		assertEquals(expected, value);
		
		value = aws.remove(2);
		assertEquals(r[2], value);
		
		r = aws.getValues();
		value = r[r.length - 1];
		assertEquals(expected, value);
		
	}
	
	@Test
	void testFillAndExpand() {
		int position = 1;
		int numberOfTimes = 2;
		int[] org = originalAWS.getValues();
		int expectedValue = org[position];
		int first = org[0];
 		
		int expected = originalAWS.getValues().length + numberOfTimes;
		originalAWS.fillAndExpand(position, numberOfTimes);
		int[] result = originalAWS.getValues();
		assertEquals(expected, result.length);
		
		int a = result[1];
		int b = result[2];
		int c = result[3];
		assertEquals(expectedValue, a);
		assertEquals(expectedValue, b);
		assertEquals(expectedValue, c);
		assertEquals(first, result[0]);
		 
		
	
	}
	// added MATH.abs()
	@Test
	void testFillAndExpandWithNegative() {
		int position = 1;
		int numberOfTimes = -2;
		
		int[] org = originalAWS.getValues();
		int expectedValue = org[position];
 		int first = org[0];
		int expected = originalAWS.getValues().length + MATH.abs(numberOfTimes);
		originalAWS.fillAndExpand(position, numberOfTimes);
		int[] result = originalAWS.getValues();
		assertEquals(expected, result.length);
		
		int a = result[1];
		int b = result[2];
		int c = result[3];
		assertEquals(expectedValue, a);
		assertEquals(expectedValue, b);
		assertEquals(expectedValue, c);
		 
		assertEquals(first, result[0]);

	
	}
	//added testRemoveBiggerThanFail() test
	@Test
	void testRemoveBiggerThanFail() {		
		int[] x= {2,6,8,3,4,7};
		originalAWS = new AWS(x);
		int threshold = 5;
		int expectedcount = 3;
		int[] org = originalAWS.getValues();
		int expectedvalue = FILLER_VALUE;
		int resultcount = originalAWS.removeBiggerThan(threshold);
		int[] resultvalue = originalAWS.getValues();
		assertEquals(expectedcount , resultcount);
		assertEquals(expectedvalue, resultvalue[1]);
		assertEquals(expectedvalue, resultvalue[2]);
		assertNotEquals(expectedvalue, resultvalue[5]);
		
	}
	// added testStepMultiplierFail()  test
	@Test
	void testStepMultiplierFail() {
		int[] x = {5,11,50};
		AWS aws = new AWS(x);
		int expected1 = 5*2;
		int expected2 = 11*4;
		int expected3 = 50*100;
		aws.stepMultiplier();
		int[] result = aws.getValues();
		assertEquals(expected1, result[0]);
		assertEquals(expected2, result[1]);
		assertNotEquals(expected3, result[2]);
		}


}
