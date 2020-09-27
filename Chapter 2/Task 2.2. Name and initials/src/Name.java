/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.2. Name and initials
 * 
 * Instruction:
 * 
 * "Write  a  program  that  has  the  following String  variables: firstName, middleName, and 
 * lastName. Initialize these with your first, middle, and last names. The program should 
 * also have  the  following char  variables: firstInitial, middleInitial, and lastInitial.  
 * Store your first, middle, and last initials in these variables.
 * The program should display the contents of these variables on the screen."
 * 
 */

public class Name {
	
	public static void main(String[] args) {
		
		String firstName = "John";
		String middleName = "Carl";
		String lastName = "Smith";
		
		System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName);
		
		System.out.println("Your initials are: " + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0));
		
	}	

}
