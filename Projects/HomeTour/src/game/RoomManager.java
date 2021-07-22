package game;



import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	
	
	static Room[] rooms;
	
	
	public void init() {
		Room main = new Room(
				"The Living Room",
				"A large multi-purpose room",
				"The main entry to the house, is a large rectangular room. "
				+ "closest to the door is a TV sitting area and some bookshelves."
				+ " The bookshelves continue on the west wall past the opening to the hallway."
				+ " At the other end of the large room is an office area with a huge 'u-shaped' desk."
				+ " Past the office area on the north wall is the entrance to the kitchen.");
		this.startingRoom = main;
		String exits [] = {"North: The Kitchen", null , "South: The Front Yard" , "West: The Hallway"};
		System.out.println("Exits");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		
				
	}
	public void hall() {
	Room hall = new Room(
		"The Hallway",
		"A short square hallway.",
		"The hallway is more of a connection room with openings to rooms on all sides."
		+ " To the east is the Living Room, to the south is Child Room 1, to the west is"
		+ " Bathroom 1 and to the north is Child Room 2. The only decoration is the"
		+ " old fashioned door-bell fixture, a holdover from when the house was new.");
	this.rooms[1] = hall;
	String exits [] = {"North: Child Room 2", "East: The Living Room" , "South: Child Room 1" , "West: The Bathroom"};
	System.out.println("Exits");
	int index = 0;
	while (index < exits.length) {
		if (exits[index] != null) {
			System.out.println(exits[index]);
			index++;
		} else index++;
	}
	}
	public void childRoom1() {
		Room childRoomOne = new Room(
			"Child Bedroom 1",
			"A teenager's Bedroom.",
			"A typical teenager's bedroom, containing a loft bed, a desk, 3 bookshelves and some "
			+ "posters. It is obvious this teenager likes Anime and LOVES to read.");
		this.rooms[2] = childRoomOne;
		String exits [] = {"North: The Hall", null , null , null};
		System.out.println("Exits");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		}
	public void bathroom() {
		Room bathroom = new Room(
			"The Bathroom",
			"A small pink bathroom.",
			"A bathroom that last recieved a major makeover in the 50's from the amount of "
			+ " pink tile, including a pink bathtub and pink counter top. It is complimented with "
			+ " a coordinating blue paint.");
		this.rooms[3] = bathroom;
		String exits [] = {null, "East: The Hallway" , null , null};
		System.out.println("Exits");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		}
	public void childRoom2() {
		Room childRoomTwo = new Room(
				"Child Bedroom 2",
				"A young boy's room",
				"A cluttered room filled with toy dinosaurs, toy cats and legos. "
				+ "Part of a hideout is visible undearneath the half-loft bed, which seems"
				+ " to be there only to hold the stuffed animals."
				+ " There is a closed door straight ahead, but it is partially blocked by toys.");
		this.rooms[4] = childRoomTwo;
		String exits [] = {"North: The Bedroom", null , "South: The Hallway" , null};
		System.out.println("Exits");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
	}
	public void kitchen() {
	Room kitchen = new Room(
		"The Kitchen",
		"A large kitchen that doubles as a Dining Room.",
		"Their is a lot of floorspace in the middle, though this is mostly taken up"
		+ " by the table for four. The west wall is lined in open pantry shelves."
		+ " The rest of the room is encircled by counters and cabinates, with the refridgerator"
		+ " anchoring the end on the north wall and the oven anchoring on the south wall.");
	this.rooms[5] = kitchen;
	String exits [] = {"North: The Backyard", null , "South: The Living Room" , "West: The Bedroom"};
	System.out.println("Exits");
	int index = 0;
	while (index < exits.length) {
		if (exits[index] != null) {
			System.out.println(exits[index]);
			index++;
		} else index++;
	}
	}
	public void bedroom() {
		Room bedroom = new Room(
			"Bedroom",
			"An adult's Bedroom",
			"A bedroom with a free standing wardrobe in place of a closet, with a king sized "
			+ "bed. That leads into a combined bathroom and laundry room.");
		this.rooms[6] = bedroom;
		String exits [] = {null, "East: The Kitchen" , "South: Child Room 2" , "West: The Laundry Room"};
		System.out.println("Exits");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		}
	public void laundry() {
		Room laundry = new Room(
			"The Laundry Room",
			"A combination Laundry and Bathroom.",
			"A large room with bathroom facilities along the north wall, washer and dryer on the "
			+ "west wall, and the south wall opening to a utility closet and storage closet.");
		this.rooms[7] = laundry;
		String exits [] = {null, "East: The Bedroom" , null , null};
		System.out.println("Exits");
		int index = 0;
		while (index < exits.length) {
			if (exits[index] != null) {
				System.out.println(exits[index]);
				index++;
			} else index++;
		}
		}

}
