package operators;

public class Assignment {

	public static void main(String[] args) {
		int x = 100;
		
		System.out.println(x = 15);
		System.out.println(x);
		
		boolean run = true;
		
		/*
		 * Be wary of the following. if(run = true)
		 * does not check the value of the boolean 'run',
		 * it CHANGES its value to true!
		 */
		if (run == true) {
			System.out.println("I ran!");
		}
		

	}

}
