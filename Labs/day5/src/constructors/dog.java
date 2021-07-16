package constructors;

public class dog {

	public String name;
	public double weight;
	public int age;
	public String breed;
	
	// This is what a default Dog constructor looks like
			// public dog(){}
	/*
	 * Below is an example of a custom constructor...
	 * typically constructors are created as a way to 
	 * initialize (set the starting value for) all field(variables)
	 * on a class
	 * 
	 * When you define a custom constructor, Java will NOT
	 * provide you with the default constructor any longer
	 * (AKA this will remove the default constructor)
	 * 
	 */
	
	public dog(String name, double weight, int age, String breed) {
		/*
		 * if you do not use the this keyword
		 * the information will 'shadow', the variables listed at an object/instance
		 * scope that share the same name. This is known as
		 * 'variable shadowing'
		 * basically this means it will use the most recent version
		 * of the variable
		 */
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.breed = breed;
		RepositoryCommunication rc = new RepositoryCommunication();
		//invoke method from some other class
		// invoke other method
		rc.passToRepo(this);
	}

	public dog(int age) {
		this("No name provided", 0.0, age, "No breed provided");
	}


	public void speak() {
		System.out.println("My name is: " + name);

	}

	/*
	 * Overloaded constructor that only provides a Single
	 * String argument for the name
	 */
	public dog(String name) {
		this.name = name;
	}
	/*
	 * Remember that overloaded methods (and constructors
	 * are differentiated by the amount and datatype of
	 * the parameters
	 */
	// public Dog (String b){
	//         breed = b;
	//     }
	
	public void bark() {
		System.out.println("Woof Woof");
	}
}
