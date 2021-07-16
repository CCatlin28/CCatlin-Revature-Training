package operators;

/*
 * The Ternary operator is used with 3 operands. A boolean
 * condition followed by two expressions. The first expression
 * will be the result of the ternary in the event the condition
 * is true, the second expression will be returned in the event
 * the condition is false
 * 
 * Ternary Syntax:
 * 
 * condition ? expr-return-true : expr-return-false;
 */
public class Ternary {
	public static void main(String[] args) {
		int a = true ? 15 : 99; // 15 is assigned to 'a'
		int b = false ? 15 : 99; // 99 is assigned to 'b'
		
		String result = a > b ? "A was larger" : "B was larger";
		System.out.println(result); // "B was larger"
		
		String x = (a == b) ? "They are the same" : "14";
		System.out.println(x);
		
		int y = (a != b) ? 0 : 14;
		System.out.println(y);
		System.out.println(x + y);
		
	}

}
