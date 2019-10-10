/*
Pranav Suresh
Class ID: CSE 360 - 70642
Assignment Number: 2
Description: This code adds and subtracts numbers to the 'total' variable.
			  It also keeps and returns a history of changes.
*/

package cse360assign2;

public class AddingMachine {
	
	private int total; //variable to add to and subtract from
	private int total1;
	private int total2;
	private int total3; //one variable for each number
	
	public AddingMachine () {
		total = 0; //not needed - included for clarity
	}

	public int getTotal() {
		return total;
	}
	
	public int add (int value) {
		total = total + value;
		return total;
	}
	
	public int subtract (int value) {
		total = total - value;
		return total;
	}
	
	public String toString () {
		total1 = add(4); //begin history by calling each
		total2 = subtract(2);
		total3 = add(5);
		return "0+" + total1 + "-" + total2 + "+"; //returns history
	}
	
	public void clear() {
		
	}
}
