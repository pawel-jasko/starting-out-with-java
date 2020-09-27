/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.3. Personal information
 * 
 * Instruction:
 * 
 * "Write a program that displays the following information, each on a separate line:
 * -  Your name
 * -  Your address, with city, state, and ZIP
 * -  Your telephone number
 * -  Your college major 
 * 
 * Although these items should be displayed on separate output lines, 
 * use only a single println statement in your program."
 * 
 */

public class Person {

	public static void main(String[] args) {
		
		String name = "John Smith";
		
		String fullAddress = "Yorkshire Street 35, New York, NY, 10001";
		
		String phoneNumber = "123456789";
		
		String universityMajor = "Computer Science";
		
		System.out.println("First and last name: " + name + "\nAddress: " + fullAddress + "\nTelephone number: " + phoneNumber + "\nUniversity Major: " + universityMajor);
		
	}	

}
