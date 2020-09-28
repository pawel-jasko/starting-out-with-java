/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.6. Land calculation
 * 
 * Instruction:
 * 
 * "One acre of land is equivalent to 43,560 square feet. Write a program that calculates the
 * number of acres in a tract of land with 389,767 square feet. Hint: Divide the size of the
 * tract of land by the size of an acre to get the number of acres."
 * 
 */

public class LandCalculation {
	
	public static void main(String[] args) {
		
		final int ACRE_TO_SQUARE_FEET_RATIO = 43560;
		
		int landAreaFeet = 389767;
		
		double landAreaAcres = (double) landAreaFeet / ACRE_TO_SQUARE_FEET_RATIO;
		
		System.out.printf("A tract of land with 389,767 square feet has %.2f acres.", landAreaAcres);
		
	}

}