package week.one;
import java.util.Scanner;
public class Dolphins {
	public static void main (String[] args){
		System.out.println("Please type 'true' if the answer is True and 'false' if the answer is False");
		System.out.println("Dolphins are mammels that live in oceans and rivers.");
		Scanner test = new Scanner(System.in);
		Boolean answer = test.nextBoolean();
		if (answer == true) {
		System.out.println("You passed");
		}else {
		System.out.println("Time for more Science Class!");
		}
		}
		}