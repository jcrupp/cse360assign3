
package cse360assign3;

import java.util.ArrayList;

/** A calculator that performs basic arithmetic (+, -, *, /), returns the total and displays a history.
 * 	 
 * @author John Rupp E-mail: jcrupp@asu.edu
 * @version Feb 21, 2016
 */
public class Calculator {

	private int total;
	private ArrayList<String> history; 
	
	/** Creates a calculator object and sets the initial total to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = new ArrayList<String>();
		
		initializeHistory(); 
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
		
		updateHistory("+", value);
	}
	
	/** Subtracts value from the total stored in the calculator.
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		
		updateHistory("-", value);
	}
	
	/** Multiplies the total stored in the calculator by value.
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
		
		updateHistory("*", value);
	}
	
	/** Divides the total stored in the calculator by value. If value equals 0 set total to 0.
	 * 
	 * @param value
	 */
	public void divide (int value) {
		if (value != 0){
			total /= value;
		} else { 
			total = 0;
		}
		
		updateHistory("/", value);
	}
	
	
	/** Returns the history of operations and their respective values that have been done with the calculator. 
	 *  The history starts with it's initial value of 0.
	 * 
	 * @return ""
	 */
	public String getHistory () {
		String historyJoined = history.toString(); 
		
		//Replace all of the characters that were inserted from the ArrayList toString method so the output is in the correct format
		historyJoined = historyJoined.replaceAll("\\[", ""); 
		historyJoined = historyJoined.replaceAll("\\]", "");
		historyJoined = historyJoined.replaceAll(",", "");

		return historyJoined;
	}
	
	/*This sets up the history to start with a zero*/
	private void initializeHistory(){
		history.add("0");
	}
	
	/*Each time an operation is called it must update the history by providing the operation and the value used*/
	private void updateHistory(String Operation, int value){
		history.add(Operation); 
		history.add(value + "");
	}
}
