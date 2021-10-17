/**
 * 
 */
package duplicateCharCount;

/**
 * @author NathanClarke
 *
 */

import java.util.HashMap;
import java.util.Scanner;

public class dupCharCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
		charCount(occurences);

	}
	
	public static void charCount(HashMap<Character, Integer> occurs) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string that you wish to test.");
		
		if(s.hasNextLine()) {		
			String test = s.nextLine();
			test = test.toLowerCase();
			test = test.replaceAll("\\s", "");
			
			for(char c : test.toCharArray()) {
				//System.out.println(c);
				if(!occurs.containsKey(c)) {
					occurs.put(c, 1);
				}
				else {
					int a = occurs.get(c);
					a++;
					occurs.replace(c, a);
				}
			}
			
			occurs.forEach((a, b) -> {
				if(b > 1) {
					System.out.println(a + " has occured " + b + " times in the given sentence.");
				}
			});
			s.close();
		}
	}

}
