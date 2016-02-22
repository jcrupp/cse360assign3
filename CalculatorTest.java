package cse360assign3;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/** A class used to test the Calculator class.
 * 	 
 * @author John Rupp E-mail: jcrupp@asu.edu
 * @version Feb 21, 2016
 */
public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/* Tests that the calculator is not null after it's created. */
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator(); 
		assertNotNull(calc);
	}

	
	
	/* The rest of the tests below should fail because they are not to be implemented in this first repo commit.*/
	
	@Test
	public void testGetTotal() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
