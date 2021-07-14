package flowcontrol;

/* Flow control statements allow you to dictate the
 * execution order of functionality within your program
 * typically using keyword/reserved words for a language
 * 
 * Conditional Statements are a sub-category of low-control
 * statements, which allow you to choose certain functionality
 * based on a boolean condition
 */
public class IfStatement {

	public static void main(String[] args) {
		System.out.println("Start of application");
		int x = 5;
		if (x < 0) {
			System.out.println("The condition was true!");
			System.out.println("We execute all of the code associated"
					+ "with an if-statement");
		}
		
		int y = 10;
		if (y >= 10) {
			System.out.println("y is big");
			}
		else {
			System.out.println("y is small");
		}
		System.out.println("End of application");

	}

}
