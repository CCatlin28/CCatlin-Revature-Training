package fixtures;

public class Room extends Fixture{
	String[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		System.out.println();
		System.out.println(":::CURRENT ROOM:::");
		System.out.println(name);
		System.out.println(shortDescription);
		System.out.println(longDescription);
	
	}
	


}
