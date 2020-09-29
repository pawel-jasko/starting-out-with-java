/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.10. Test Average
 * 
 * Instruction:
 * 
 * "Write a program that asks the user to enter three test scores. The program should 
 * display each test score, as well as the average of the scores."
 * 
 */

import java.util.Scanner;

public class AverageTestScoreCalculator {
	
	public static void main(String[] args) {
		
		double firstTestScore;
		double secondTestScore;
		double thirdTestScore;
		
		double averageTestScore;
		
// a Scanner object created to collect keyboard input from the User
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Enter first test score:");
		
		firstTestScore = keyboardInput.nextDouble();
		
		System.out.println("\nEnter second test score:");
		
		secondTestScore = keyboardInput.nextDouble();
		
		System.out.println("\nEnter third test score:");
		
		thirdTestScore = keyboardInput.nextDouble();
		
		keyboardInput.close();
		
		averageTestScore = (firstTestScore + secondTestScore + thirdTestScore) / 3;
		
		System.out.printf("\nFirst test score: %.2f", firstTestScore);
		System.out.printf("\nSecond test score: %.2f", secondTestScore);
		System.out.printf("\nThird test score: %.2f", thirdTestScore);
		System.out.printf("\n\nTest score average: %.2f", averageTestScore);
		
	}

}