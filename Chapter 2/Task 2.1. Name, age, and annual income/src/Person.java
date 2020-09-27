/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.1. Name, age, and annual income
 * 
 * Instruction:
 * 
 * "Write a program that declares the following:
 * - a String variable named name
 * - an int variable named age
 * - a double variable named annualPay
 * 
 * Store your age, name, and desired annual income as literals in these variables. 
 * The program should display these values on the screen."
 * 
 */

public class Person {
	
	public static void main(String[] args) {
		
		String name = "John Smith";
		int age = 25;
		double annualPay = 100000.0;
		
		System.out.println("My name is " + name + ", my age is " + age + " and");
		System.out.println("I hope to earn $" + annualPay + " per year.");
		
	}

}
