package exceptions;

public class Simulator {
	public static void main(String[] args) {
		
	}
	/*
	 * Using a 'throws' declaration is known as 'ducking' the
	 * exception. This means that we will NOT resolve the issue
	 * directly within this method, but rather will communicate
	 * to the location that invokes this method, that the issue
	 * must be resolved. This is used to consolidate try-catch
	 * clocks in your code, to a single resolution
	 */
	
	public static int sumOddNumbers (int a, int b) 
		throws EvenNumberException {
		if (a % 2 == 0) {
			throw new EvenNumberException("First Input was Even");
		} else if { b % 2 == 0) {
			throw new EvenNumberException("Second Input was Even";)
		}
		return a + b;
	}

}
