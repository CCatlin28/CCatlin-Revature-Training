package operators;

/*
 * The Ternary operator is used with 3 operands. A boolean
 * condition followed by two expressions. The first expression
 */
public class Ternary {

	public static void main(String[] args) {
		int a = true ? 15 : 99; // 15 is assigned to 'a'
		int b = false ? 15 : 99; // 99 is assigned to 'b'
		
		String result = a > b ? "A was larger" : "B was larger";
		System.out.println(result); // "B was larger"
		
		System.out.println();
	}

}
