package machines;

/*
 * All classes will implicitly inherit from the Object class
 * if no other inheritance is declared. In this way, all
 * classes will inherit from Object either directly
 * or through the parent hierarchy
 */

public class Vehicle extends Object {
	public int passengerCount;
	public String engineSize;
	public String model;
	public String type;
	
	public void drive() {
		System.out.println("Vroom Vroom");
	}
	public void start() {
		System.out.println("Starting the Engine");
		
	}
	
}
