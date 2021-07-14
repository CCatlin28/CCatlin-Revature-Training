package operators;

/*
 * Logical Operators are a set of boolean operators that
 * compare two boolean values/operands. Based on the value
 * of those boolean operands, the logical operator will return
 * either true or false.
 * 
 * The logical operators are & (and) and  (or)
 */
public class LogicalOperators {

	public static void main(String[] args) {
		/*
		 * AND operators will return false unless both
		 * operands are true
		 */
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
		/*
		 * OR operators will return true if at least one 
		 * operand is true
		 */
		
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false
	}
	
	
	
}
