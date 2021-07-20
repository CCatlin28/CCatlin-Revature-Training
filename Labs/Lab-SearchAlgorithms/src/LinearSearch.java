
public class LinearSearch {

	public static void main(String[] args) {
		// create some dummy data for our method
		char letter = 'n';
		char[] letters = null;
		//char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
		//'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
		//'s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		//call your methods here
LinearSearch ls = new LinearSearch();
System.out.println(ls.findIndex(letter, letters));
	}
// create your first method here
	public int findIndex(char target, char[] data) {
		if (data == null) return -1;
		int result = -1;
		//loop through the data
		for (int i = 0; i < data.length; i++) {
			char temp = data[i];
			
		
		//test current element against target
		if (temp == target) {
		return i;
	}}
		return result;
		
	}
}
/*
 * Lab Tip: When writing methods that will be called by other classes (especially
 * those written by other developers), it is a good idea
 * to make sure your method won't cause the program to crash
 * because of unexpected input values. You should handle all inputs gracefully.
 * 
 * Mom Translation: treat the methods as giving instructions to small
 * child who wants to get out of doing chores... every input no 
 * matter how illogical is possible
 */
