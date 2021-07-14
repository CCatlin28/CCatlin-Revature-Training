
public class ConditionalBlocks {

	public static void main(String[] args) {
		
// code for the first conditional blocks lab if statements
		{boolean b = false;
		
		if (b) {
			System.out.println("Inside the lab 1 if-statement");
		} // this only prints if b = true
		
		System.out.println("Outside of the lab 1 if-statement");
		} // this always prints
		
		
// part a of the second conditional blocks lab if else statements
		{boolean b = false;
	if (b) {
		System.out.println("Inside the lab 2 part a if-statement");
	} // prints if b = true
		else { System.out.println("Inside the lab 2 part a else - statement");
	} // prints if b = false
	
	System.out.println("Outside of the lab 2 part a if-statement");
	} // always prints

		
// part b of the second conditional blocks lab nested if statements
	{boolean firstCondition = false;
	boolean secondCondition = true;
	
	if (firstCondition) {
		System.out.println("Inside the lab 2 part b if-statement");
		// prints if firstCondition = true
		
		if (secondCondition) {
			System.out.println("Inside the lab 2 part b nested if-statement");
		} // prints if the first and secondCondition = true
		else {
			System.out.println("Inside the lab 2 part b else statement");
		} // prints if first condition is true and the second condition is false
	}
		System.out.println("Outside the lab 2 part b if-statement");
	} // always prints
	
			

	
// part c of the second conditional blocks lab else-if statements
	{boolean firstCondition = true;
	boolean secondCondition = false;
	
	if (firstCondition) {
		System.out.println("inside the lab 2 part c if-statement");
		//prints if firstCondition is true
		
		if (secondCondition) {
			System.out.println("inside the lab 2 part c nested if-statement");
		} // prints if first AND second condition are true
	}else if (secondCondition) {
		System.out.println(5);
		//prints if first is false and second is true
	}else {
		System.out.println("inside the lab 2 part c else-statement");
	} // prints if both false
	
	System.out.println("Outside of the lab 2 part c if-statement");
		} // always prints
	
	
	}	
}
