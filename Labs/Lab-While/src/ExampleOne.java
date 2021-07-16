
public class ExampleOne {

	public static void main(String[] args) {
		boolean on = true;
		
		while(on) {
			System.out.println("Inside the while loop");
			on = false; // if this line is left out an infinate loop is created
		}

	}

}
