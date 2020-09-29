/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.7. Cookie Calories
 * 
 * Instruction:
 * 
 * "A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are
 * 10 servings in the bag and that a serving equals 300 calories. Write a program that lets the
 * user enter the number of cookies he or she actually ate and then reports the number of total
 * calories consumed.
 * 
 */

import java.util.Scanner;

public class CaloriesCalculator {
	
	public static void main(String[] args) {
		
		final int cookiesAmountPerBox = 40;
		final int cookiesServingsPerBox = 10;
		final int caloriesPerServing = 300;
		final int caloriesPerCookie = (caloriesPerServing * cookiesServingsPerBox) / cookiesAmountPerBox;
		
// a Scanner object created to collect keyboard input from the User
		
		Scanner userInput = new Scanner(System.in);
		
		int eatenCookies;
				
		System.out.println("How many cookies did you eat?");
		
		eatenCookies = userInput.nextInt();
		
		userInput.close();
		
		int consumedCalories = eatenCookies * caloriesPerCookie;
		
		System.out.printf("\nYou ate %d cookies which amounts to %d calories.", eatenCookies, consumedCalories);
		
	}

}
