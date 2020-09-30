/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.12. String Manipulator
 * 
 * Instruction:
 * 
 * Write a program that asks the user to enter the name of his or her favorite city. 
 * Use a String variable to store the input. The program should display the following: 
 * The number of characters in the city name
 * The name of the city in all uppercase letter
 * The name of the city in all lowercase letter
 * The first character in the name of the city
 */

import java.util.Scanner;

public class StringInformation {
	
	public static void main(String[] args) {
		
		String cityName;
		
		//A scanner object created to save user input
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the name of your favorite city:");
		
		cityName = userInput.nextLine();
		
		userInput.close();
		
		//trim() is used to delete any leading or trailing spaces which might have been added by the user
		
		cityName = cityName.trim();
		
		System.out.println("\nFavorite city: " + cityName);

		System.out.println("\nNumber of letters: " + cityName.length());
		System.out.println("Upper-case: " + cityName.toUpperCase());
		System.out.println("Lower-case: " + cityName.toLowerCase());
		System.out.println("First letter of the name: " + cityName.charAt(0));
		
	}

}
