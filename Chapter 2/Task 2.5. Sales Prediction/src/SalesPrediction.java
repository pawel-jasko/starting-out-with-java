/* Programming task assigned in T. Gaddis, Starting Out with Java, 7th ed.
 * 
 * Task 2.5. Sales prediction
 * 
 * Instruction:
 * 
 * "The East Coast sales division of a company generates 62 percent of total sales. Based on
that percentage, write a program that will predict how much the East Coast division will
generate if the company has $4.6 million in sales this year. Hint: Use the value 0.62 to
represent 62 percent."
 * 
 */

public class SalesPrediction {
	
	public static void main(String[] args) {
		
		double predictedCompanySales = 4600000.0;
		
		double eastCoastSalesShare = 0.62;
		
		double predictedEastCoastSales = predictedCompanySales * eastCoastSalesShare;
		
		System.out.println("The East Coast division will generate: $" + predictedEastCoastSales +" in sales this year if the company makes $4.6 million in total.");
		
	}

}
