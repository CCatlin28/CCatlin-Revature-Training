package machines;

import utilities.Flyable;

public class Plane extends Vehicle implements Flyable{
	public void fly() {
		System.out.println("High up in the sky");
	}

}
