package flowcontrol;

public class SwitchStatement {

	public static void main(String[] args) {
		char letter = 'J';
		
		switch (letter) {
		case 'A':
			System.out.println("A is for Assembly");
			
		case 'B':
			System.out.println("B is for Binary");
			
		case 'C':
			System.out.println("C is for Compiled");
			break;
		default:
			System.out.println("no matching letter found");
		}

	}

}
