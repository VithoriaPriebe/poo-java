
public class calculateTotalMealPrice {

	public static double calcularTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
		double tip = tipRate * listedMealPrice;
		double tax = taxRate * listedMealPrice;
		double result = listedMealPrice + tip + tax;
		return result;
	}
	
	public static void main(String[] args) {
		double groupTotalMealCost = calcularTotalMealPrice(100, 0.2, 0.08);
		System.out.println(groupTotalMealCost);
		
		double individualMealPrice = groupTotalMealCost / 5;
		System.out.println(individualMealPrice);

	}

}
