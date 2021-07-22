package game;

import java.util.Scanner;


public class Main {
public static Scanner scan = new Scanner(System.in);
	
	public Scanner getScanner() {
		return scan;
}
	
	public static void main (String[] args) {
		RoomManager rm = new RoomManager();
		Menu menu = new Menu();
		System.out.println("Input Instructions here");
		System.out.println(" ");
		System.out.println(":::CURRENT ROOM:::");
		System.out.println(" ");
		rm.init();
		menu.getScanner();
		String word = scan.next();
		//scan the input and compare to exit options to pull the next method
		//solved the first problem now to solve the next... apparently all I had to do to get my
		//brain to work again was to ask questions... didn't even need the feedback
		if (word == "go") { 
		}
			
		}
		
	}
	
	private static void printRoom(Player player) {
	
		
	//	System.out.println(currentRoom);
		
	}
	
	private static String[] collectInput() {
		return null;
		
	}
	
	private static void parse(String[] command, Player player) {
		
	}

}
