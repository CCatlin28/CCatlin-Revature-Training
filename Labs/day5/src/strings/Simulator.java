package strings;

public class Simulator {

	public static void main(String[] args) {
		String one = "Revature";
		String two = new String ("Revature");
		String three = "Revature";
		String four = "Christy";
		
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		
		System.out.println(one == two);
		System.out.println(one == three);
		System.out.println(three == two);
		System.out.println(one == four);
		/*
		 * the '==' operator compares memory addresses
		 * When creating Strings, string literals are
		 * placed in the String pool, while other String
		 * objects are placed in the normal heap area
		 */

		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
	}

}
