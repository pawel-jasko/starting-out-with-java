/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.7. Sales Tax
 * 
 * Instruction:
 * 
 * "Write a program that will ask the user to enter the amount of a purchase. The program
 * should then compute the state and county sales tax. Assume the state sales tax is 4 percent
 * and the county sales tax is 2 percent. The program should display the amount of the 
 * purchase, the state sales tax, the county sales tax, the total sales tax, and the total of 
 * the sale (which is the sum of the amount of purchase plus the total sales tax). Hint: Use 
 * the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent."
 * 
 */

import java.util.Scanner;

public class TaxCalculator {
	
	public static void main(String[] args) {
		
		double purchaseAmount;
		
		final double STATE_TAX_VALUE = 0.04;
		
		double stateSalesTax;
		
		final double COUNTY_TAX_VALUE = 0.02;
		
		double countySalesTax;
		
		double totalSalesTax;
		
		double totalSaleValue;
		
// a Scanner object created to collect keyboard input from the User
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please provide the amount of the purchase:");
		
		purchaseAmount = userInput.nextDouble();
		
		userInput.close();
		
		stateSalesTax = purchaseAmount * STATE_TAX_VALUE;
		
		countySalesTax = purchaseAmount * COUNTY_TAX_VALUE;
		
		totalSalesTax = stateSalesTax + countySalesTax;
		
		totalSaleValue = purchaseAmount + totalSalesTax;
		
		System.out.printf("\nThe amount of the purchase: %.2f", purchaseAmount);
		System.out.printf("\nThe state sales tax: %.2f", stateSalesTax);
		System.out.printf("\nThe county sales tax: %.2f", countySalesTax);
		System.out.printf("\nThe total sales tax: %.2f", totalSalesTax);
		System.out.printf("\nThe total of the sale: %.2f", totalSaleValue);
		
	}

}