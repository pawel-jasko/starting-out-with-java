/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.11. Circuit Board Profit
 * 
 * Instruction:
 * 
 * "An electronics company sells circuit boards at a 40 percent profit. If you know the
 * retail price of a circuit board, you can calculate its profit with the following 
 * formula: Profit = Retail price × 0.4
 * Write a program that asks the user for the retail price of a circuit board, calculates 
 * the amount of profit earned for that product, and displays the results on the screen."
 * 
 */

import java.util.Scanner;

public class ProfitCalculator {
	
	public static void main(String[] args) {
		
		double boardRetailPrice;
		final double PROFIT_RATIO = 0.4;
		double totalProductProfitValue;
		
		//Scanner object created to save user input
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the retail price of a circuit board:");
		
		boardRetailPrice = userInput.nextDouble();
		
		userInput.close();
		
		totalProductProfitValue = (boardRetailPrice * PROFIT_RATIO);
		
		System.out.printf("\nTotal profit generated for selling the board is: %.2f", totalProductProfitValue);
		
	}

}