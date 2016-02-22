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


	@Test
	public void testCalculator() {
		Calculator calc = new Calculator(); 
		
		assertNotNull(calc);
	}

	
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		
		assertEquals(0, calc.getTotal());
	}

	
	@Test
	public void testAddNegNum() {
		Calculator calc = new Calculator();
		
		calc.add(-1);
		
		assertEquals(-1, calc.getTotal());
	}
	
	@Test
	public void testAddZero() {
		Calculator calc = new Calculator();
		
		calc.add(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testAddPosNum() {
		Calculator calc = new Calculator();
		
		calc.add(1);
		
		assertEquals(1, calc.getTotal());
	}

	
	@Test
	public void testSubtractNegNum() {
		Calculator calc = new Calculator();
		
		calc.subtract(-1);
		
		assertEquals(1, calc.getTotal());
	}
	
	@Test
	public void testSubtractZero() {
		Calculator calc = new Calculator();
		
		calc.subtract(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testSubtractPosNum() {
		Calculator calc = new Calculator();
		
		calc.subtract(1);
		
		assertEquals(-1, calc.getTotal());
	}

	

	@Test
	public void testMultiplyNegNum() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.multiply(2);
		
		assertEquals(4, calc.getTotal());
	}

	@Test
	public void testMultiplyZero() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.multiply(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testMultiplyPosNum() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.multiply(-2);
		
		assertEquals(-4, calc.getTotal());
	}
	
	
	@Test
	public void testDivideNegNum() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.divide(-2);
		
		assertEquals(-1, calc.getTotal());
	}

	@Test
	public void testDivideZero() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testDividePosNum() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.divide(2);
		
		assertEquals(1, calc.getTotal());
	}
	

	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		
		calc.add (4);
		calc.subtract (2);
		calc.multiply (2);
		calc.divide (2);
		calc.add(5);
		
		assertEquals("0 + 4 - 2 * 2 / 2 + 5", calc.getHistory());
	}

}
