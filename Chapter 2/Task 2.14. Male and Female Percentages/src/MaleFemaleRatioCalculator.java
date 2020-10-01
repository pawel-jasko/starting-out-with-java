/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.14. Male and Female Percentages
 * 
 * Instruction:
 * 
 * Write a program that asks the user for the number of males and the number of females
 * registered in a class. The program should display the percentage of males and females
 * in the class.
 * Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the
 * class. The percentage of males can be calculated as 8/20 = 0.4, or 40%. The
 * percentage of females can be calculated as 12/20 = 0.6, or 60%.
 * 
 */

import java.util.Scanner;

public class MaleFemaleRatioCalculator {
	
	public static void main(String[] args) {
		
		int numberOfMen;
		int numberOfWomen;
		int totalNumberOfParticipants;
		
		double maleParticipantsPercentage;
		double femaleParticipantsPercentage;
		
		//A scanner object created to save user input
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the number of men taking part in the course:");
		
		numberOfMen = userInput.nextInt();
		
		System.out.println("\nPlease enter the number of women taking part in the course:");
		
		numberOfWomen = userInput.nextInt();
		
		userInput.close();
		
		totalNumberOfParticipants = numberOfMen + numberOfWomen;
		
		maleParticipantsPercentage = ((double) numberOfMen / totalNumberOfParticipants) * 100;
		
		//Math.round() is used to even out the result of the calculation
		
		maleParticipantsPercentage = Math.round(maleParticipantsPercentage);

		femaleParticipantsPercentage = ((double)numberOfWomen / totalNumberOfParticipants) * 100;
		
		//Math.round() is used to even out the result of the calculation
		
		femaleParticipantsPercentage = Math.round(femaleParticipantsPercentage);
		
		System.out.printf("\nPercentage of male course participants: %.2f", maleParticipantsPercentage);
		System.out.printf("\nPercentage of female course participants: %.2f", femaleParticipantsPercentage);
		
	}

}