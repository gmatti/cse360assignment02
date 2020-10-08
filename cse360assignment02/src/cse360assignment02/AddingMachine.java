package cse360assignment02;

/**
 * This class represents and adding machine (a calculator) 
 * @author Ghassan Matti
 *
 */
public class AddingMachine 
{
	 private int total;
	 private String hist = "0";
	 
	 /**
	  * AddingMachine default constructor 
	  */
	 public AddingMachine () 
	 {
	    total = 0;  // not needed - included for clarity
	 }
	 
	 /**
	  * get the total  
	  * @return the total
	  */
	 public int getTotal () 
	 {
	    return total;
	 }
	 
	 /**
	  * adds the value
	  * @param value
	  */
	 public void add (int value) 
	 {
		 total = total + value;
		 hist = hist + " + " + value;
		 
	 }
	 
	 /**
	  * subtracts the value
	  * @param value
	  */
	 public void subtract (int value) 
	 {
		 total = total - value;
		 hist = hist + " - " + value;
	 }
	 
	 /**
	  * returns the representation of the string
	  */
	 public String toString () 
	 {
	    return hist;
	 }
	 
	 /**
	  * clear method will clear the transaction and set it back to 0
	  */
	 public void clear() 
	 {
		 //setting the total and the transaction history back to 0
		 total = 0; 
		 hist = "0";
	 }
}
