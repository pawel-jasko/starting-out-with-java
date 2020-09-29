/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.9. Miles-per-Gallon
 * 
 * Instruction:
 * 
 * A car’s miles-per-gallon (MPG) can be calculated with the following formula:
 * MPG = Miles driven / Gallons of gas used
 * 
 * Write a program that asks the user for the number of miles driven and the gallons of
 * gas used. It should calculate the car’s miles-per-gallon and display the result on the 
 * screen.
 * 
 */

import java.util.Scanner;

public class MilesPerGallonCalculator {
	
	public static void main(String[] args) {
		
// a Scanner object created to collect keyboard input from the User
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Enter number of miles driven:");
		
		int milesDriven = keyboardInput.nextInt();
		
		System.out.println("\nEnter number of gallons of gas used:");
		
		int gallonsOfGasUsed = keyboardInput.nextInt();
		
		keyboardInput.close();
		
		double milesPerGallonRatio = (double) milesDriven / gallonsOfGasUsed;
		
		System.out.printf("\nThe miles-per-gallon ratio is: %.2f", milesPerGallonRatio);
		
	}

}
