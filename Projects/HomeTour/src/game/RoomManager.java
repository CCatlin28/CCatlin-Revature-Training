package game;

import fixtures.Room;

public class RoomManager {
			
	public Room main() {
			Room main = new Room(
				"The Living Room",
				"A large multi-purpose room",
				"The main entry to the house, is a large rectangular room. "
				+ "closest to the door is a TV sitting area and some bookshelves."
				+ " The bookshelves continue on the west wall past the opening to the hallway."
				+ " At the other end of the large room is an office area with a huge 'u-shaped' desk."
				+ " Past the office area on the north wall is the entrance to the kitchen.");
		String []exits = {"Kitchen", null , "Front Yard" , "Hallway"};
		System.out.println();
		System.out.println("::Items::");
		System.out.println("Bookshelf");
		System.out.println("Couch");
		System.out.println();
		System.out.println("::Exits::");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		} 
		return main;
	}
	
	public Room hall() {
			Room hall = new Room(
				"The Hallway",
				"A short square hallway.",
				"The hallway is more of a connection room with openings to rooms on all sides."
				+ " To the east is the Living Room, to the south is the Teen Bedroom, to the west is"
				+ " Bathroom 1 and to the north is Child Room. The only decoration is the"
				+ " old fashioned door-bell fixture, a holdover from when the house was new.");
		String exits [] = {"Child Bedroom", "Living Room" , "Teen Bedroom" , "Bathroom"};
		System.out.println();
		System.out.println("::Items::");
		System.out.println("none");
		System.out.println();
		System.out.println("::Exits::");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		return hall;
	}
	
	public Room teenRoom() {
			Room teenRoom = new Room(
				"Teen Bedroom",
				"A teenager's Bedroom.",
				"A typical teenager's bedroom, containing a loft bed, a desk, 3 bookshelves and some "
				+ "posters. It is obvious this teenager likes Anime and LOVES to read.");
		String exits [] = {"Hallway", null , null , null};
		System.out.println();
		System.out.println("::Items::");
		System.out.println("Bookshelf");
		System.out.println("Bed");
		System.out.println();
		System.out.println("::Exits::");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		return teenRoom;
		}
	
	public Room bathroom() {
		Room bathroom = new Room(
			"The Bathroom",
			"A small pink bathroom.",
			"A bathroom that last recieved a major makeover in the 50's from the amount of "
			+ " pink tile, including a pink bathtub and pink counter top. It is complimented with "
			+ " a coordinating blue paint.");
		String exits [] = {null, "Hallway" , null , null};
		System.out.println();
		System.out.println("::Items::");
		System.out.println("none");
		System.out.println();
		System.out.println("::Exits::");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		return bathroom;
		}
	
	public Room childRoom() {
		Room childRoom = new Room(
				"Child Bedroom",
				"A young boy's room",
				"A cluttered room filled with toy dinosaurs, toy cats and legos. "
				+ "Part of a hideout is visible undearneath the half-loft bed, which seems"
				+ " to be there only to hold the stuffed animals."
				+ " There is a closed door straight ahead, but it is partially blocked by toys.");
		String exits [] = {"Bedroom", null , "Hallway" , null};
		System.out.println();
		System.out.println("::Items::");
		System.out.println("Toys");
		System.out.println("Bed");
		System.out.println("Bookshelf");
		System.out.println();
		System.out.println("::Exits::");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		return childRoom;
	}
	
	public Room kitchen() {
	Room kitchen = new Room(
		"The Kitchen",
		"A large kitchen that doubles as a Dining Room.",
		"Their is a lot of floorspace in the middle, though this is mostly taken up"
		+ " by the table for four. The west wall is lined in open pantry shelves."
		+ " The rest of the room is encircled by counters and cabinates, with the refridgerator"
		+ " anchoring the end on the north wall and the oven anchoring on the south wall.");
	String exits [] = {"Back Yard", null , "Living Room" , "Bedroom"};
		System.out.println();
		System.out.println("::Items::");
		System.out.println("Refrigerator");
		System.out.println();
		System.out.println("::Exits::");
	int index = 0;
	while (index < exits.length) {
		if (exits[index] != null) {
			System.out.println(exits[index]);
			index++;
		} else index++;
	}
	return kitchen;
	}
	
	public Room bedroom() {
		Room bedroom = new Room(
			"Bedroom",
			"An adult's Bedroom",
			"A bedroom with a free standing wardrobe in place of a closet, with a king sized "
			+ "bed. That leads into a combined bathroom and laundry room.");
		String exits [] = {null, "Kitchen" , "Child Bedroom" , "Laundry Room"};
		System.out.println();
		System.out.println("::Items::");
		System.out.println("Bookshelf");
		System.out.println("Bed");
		System.out.println();
		System.out.println("::Exits::");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		return bedroom;
		}
	
	public Room laundry() {
		Room laundry = new Room(
			"The Laundry Room",
			"A combination Laundry and Bathroom.",
			"A large room with bathroom facilities along the north wall, washer and dryer on the "
			+ "west wall, and the south wall opening to a utility closet and storage closet.");
		String exits [] = {null, "Bedroom" , null , null};
		System.out.println();
		System.out.println("::Items::");
		System.out.println("none");
		System.out.println();
		System.out.println("::Exits::");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		return laundry;
		}

}
