package animals;

import utilities.Flyable;
import utilities.Fruit;
import utilities.Herbiverous;
import utilities.Vegetables;

public class Bat implements Flyable, Herbiverous{
	public void fly() {
		System.out.println("Flying at night");
	}

	@Override
	public void eat(Fruit f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void digest(Fruit f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat(Vegetables f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void digest(Vegetables f) {
		// TODO Auto-generated method stub
		
	}

}
