/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.13. Restaurant Bill
 * 
 * Instruction:
 * 
 * Write a program that computes the tax and tip on a restaurant bill. The program should 
 * ask the user to enter the charge for the meal. The tax should be 6.75 percent of the
 * meal charge. The tip should be 20 percent of the total after adding the tax. Display
 * the meal charge, tax amount, tip amount, and total bill on the screen
 * 
 */

import java.util.Scanner;

public class BillCalculator {
	
	public static void main(String[] args) {
		
		double mealCharge;
		
		final double MEAL_TAX = 0.0675;
		
		double taxValue;
		
		double grossMealValue;
		
		final double TIP_RATIO = 0.2;
		
		double tipValue;
		
		double totalMealPrice;
		
		//A scanner object created to save user input
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the charge for the meal:");
		
		mealCharge = userInput.nextDouble();
		
		userInput.close();
		
		taxValue = mealCharge * MEAL_TAX;
		
		grossMealValue = mealCharge + taxValue;
			
		tipValue = grossMealValue * TIP_RATIO;
		
		totalMealPrice = grossMealValue + tipValue;
		
		System.out.printf("\nMeal charge: %.2f", mealCharge);
		System.out.printf("\nTax amount: %.2f", taxValue);
		System.out.printf("\nTip amount: %.2f", tipValue);
		System.out.printf("\nTotal bill: %.2f", totalMealPrice);
		
	}

}