package game;

import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	
		public Scanner getScanner() {
		return scan;
		}
	
	public static void main (String[] args) {
		RoomManager rm = new RoomManager();
		
			System.out.println("To move around the house please type"
					+ " the word 'go' followed by the name of"
					+ " the room you would like to enter."
					+ " To interact with an item type the word 'interact'"
					+ " followed by the name of the item you would like to"
					+ " interact with. To try something fun type the word 'fun'."
					+ " To leave the game type 'exit' or go to one of the yards.");

		Player p = new Player();
		p.setCurrentRoom(rm.main());
		p.getCurrentRoom();
		p.Instructions();
	}
	
}
