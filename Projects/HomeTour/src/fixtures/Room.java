package fixtures;

public class Room extends Fixture{
	Room[] exits;
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
		
		
		System.out.println(name);
		System.out.println(" ");
		System.out.println(shortDescription);
		System.out.println(" ");
		System.out.println(longDescription);
		System.out.println(" ");
		System.out.println();
	}
	
	public Room[] getExits() {
		return exits;
		
		
	}
	public Room getExit(String direction) {
		return null;
		
	}

}
