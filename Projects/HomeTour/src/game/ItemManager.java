package game;

import fixtures.Item;

public class ItemManager {

	public Item Bookshelf() {
		Player p = new Player();
		Item Bookshelf = new Item ("Bookshelf", "A floor to ceiling shelving unit");
		System.out.println("You review the books on the shelf and choose one to read.");
		p.Instructions();
		return Bookshelf;
	}
	
	public Item Refrigerator() {
		Player p = new Player();
		Item Refrigerator = new Item ("Refrigerator", "A large combined freezer and refridgerator");
		System.out.println("You open the refridgerator and select a snack to eat.");
		p.Instructions();
		return Refrigerator;
	}
	
	public Item Toys() {
		Player p = new Player();
		Item Toys = new Item ("Toys", "A large variety of small items that children play with");
		System.out.println("You pick up Toys from the floor and call for the child they belong to.");
		p.Instructions();
		return Toys;
	}
	
	public Item Couch() {
		Player p = new Player();
		Item Couch = new Item ("Couch", "A worn out three seater couch.");
		System.out.println("You curl up on the couch... 'maybe to read a book'.");
		p.Instructions();
		return Couch;
	}
	
	public Item Bed() {
		Player p = new Player();
		Item Bed = new Item ("Bed", "somthing comfortable to sleep on");
		System.out.println("You lie down to take a nap");
		p.Instructions();
		return Bed;
		
	}
}
