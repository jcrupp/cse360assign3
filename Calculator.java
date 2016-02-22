
package cse360assign3;

/** A calculator that performs basic arithmetic (+, -, *, /), returns the total and displays a history.
 * 	 
 * @author John Rupp E-mail: jcrupp@asu.edu
 * @version Feb 21, 2016
 */
public class Calculator {

	private int total;
	
	/** Creates a calculator object and sets the initial total to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Returns the total stored in the calculator.
	 * 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/** Adds value to the total stored in the calculator.
	 * 
	 * @param value
	 */
	public void add (int value) {
		total += value;
	}
	
	/** Subtracts value from the total stored in the calculator.
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/** Multiplies the total stored in the calculator by value.
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/** Divides the total stored in the calculator by value. If value equals 0 set total to 0.
	 * 
	 * @param value
	 */
	public void divide (int value) {
		if (value != 0)
			total /= value;
		else 
			total = 0;
	}
	
	/** Returns the history of operations and their respective values that have been done with the calculator. 
	 *  The history starts with it's initial value of 0.
	 * 
	 * @return ""
	 */
	public String getHistory () {
		return "";
	}
}
