package operators;

/*
 * Binary operators, similar to unary, apply to a number
 * of operands, specificaly, binary operators apply to
 * 2 operands.  All operators are 
 * some of these operators only apply to specific datatypes
 * while others will returen specific datatypes as well
 * 
 */
public class Binary {

	public static void main(String[] args) {
		/*
		 * The Modulus (%) operator will perform
		 * a division between two numbers. The first 
		 * operand, divided by the second. And then 
		 * will return the REMAINDER after the division
		 */
		int mod = 10 % 3; //1
		System.out.println(mod);
		
		System.out.println("Hello There:" + 5 + 2); 
		/* this is treated as a string because Hello World is added to 5
		before 2 is added to 5
		*/
		 System.out.println("Hello There:" + (5 + 2));
		 
		 System.out.println( 10 > 10); // false
		 System.out.println (10 >= 10); // true
		 
		 System.out.println (10 == 10); // true
		 System.out.println (10 != 10); // false
		 
		 /*
		  * division with integers can be a bit confusing at 
		  * first. Keep in mind that ANY whole number literal
		  * when used in any expression or assignment is treated
		  * as an int datatype. int datatypes DO NOT use any
		  * decimal point values
		  */
		 int result = 9/2;
		 System.out.println(result); // 4
		 

	}

}
