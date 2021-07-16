package constructors;

public class Simulator {

	public static void main(String[] args) {
		dog scooby = new dog("Scooby Doo", 100.00, 7, "Great Dane");
System.out.println(scooby.name + " is a " + scooby.breed);	
System.out.println(scooby.name + " is " + scooby.age + " years old.");

		dog jazz = new dog(8);
		
		System.out.println(jazz.name + " is a " + jazz.breed);	
		System.out.println(jazz.name + " is " + jazz.age + " years old.");


	}

}
