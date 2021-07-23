package game;

import java.util.Scanner;

import fixtures.Room;

public class Player {
	private Room currentRoom;
	public Room getCurrentRoom() {
			
		return this.currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public static Scanner scan = new Scanner(System.in);
	public Scanner getScanner() {
	return scan;
	}
	
	public void Instructions() {
		Fun fun = new Fun();
		getScanner();
		String word = scan.next();
		try {
		if (word.equalsIgnoreCase( "go")) {
			Doorways ();
		} else if (word.equalsIgnoreCase("interact")) {
			Interact();
		} else if (word.equalsIgnoreCase("fun")){
						fun.doSomething();
		} else 	{
		System.out.println("Thank you for stopping by!");
	}
		} finally { 
			System.out.println("Have a Good Day!");
		}
		Doorways();
	}
		
	
public void Doorways() {
	RoomManager rm = new RoomManager();
		String exit = scan.next();
		if (exit.equalsIgnoreCase("Living")){
			String reset = scan.next();
			setCurrentRoom(rm.main());
			getCurrentRoom();
		}else if (exit.equalsIgnoreCase("Hallway")){
			setCurrentRoom(rm.hall());
			getCurrentRoom();
		}else if (exit.equalsIgnoreCase("Teen")){
			String reset = scan.next();
			setCurrentRoom(rm.teenRoom());
			getCurrentRoom();
		}else if (exit.equalsIgnoreCase("Bathroom")){
				setCurrentRoom(rm.bathroom());
				getCurrentRoom();
		}else if (exit.equalsIgnoreCase("Child")){
			String reset = scan.next();
			setCurrentRoom(rm.childRoom());
			getCurrentRoom();
		}else if (exit.equalsIgnoreCase("Kitchen")){
			setCurrentRoom(rm.kitchen());
			getCurrentRoom();
		}else if (exit.equalsIgnoreCase("Bedroom")){
			setCurrentRoom(rm.bedroom());
			getCurrentRoom();
		}else if (exit.equalsIgnoreCase("Laundry")){
			String reset = scan.next();
			setCurrentRoom(rm.laundry());
			getCurrentRoom();
		}else if (exit.equalsIgnoreCase("Back")){
			System.out.println("You have exited the house into the Backyard.");
		}else if (exit.equalsIgnoreCase("Front")){
			System.out.println("You have exited the house into the Frontyard.");
		} else { System.out.println("You ran into a wall");
		} Instructions();
	}

	public void Interact() {
		ItemManager im = new ItemManager();
		String object = scan.next();
		if (object.equalsIgnoreCase("Bookshelf")) {
			im.Bookshelf();
		} else if (object.equalsIgnoreCase("Refrigerator")) {
			im.Refrigerator();
		} else if (object.equalsIgnoreCase("Toys")) {
			im.Toys();
		} else if (object.equalsIgnoreCase("Couch")) {
			im.Couch();
		} else if (object.equalsIgnoreCase("Bed")) {
			im.Bed();
		} else { System.out.println("Dance to the Music");
		} Instructions();
		}
	
}