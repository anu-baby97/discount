package discount;

public class DiscountMain {

	public static void main(String[] args) {
		double cost = 75000;
		
		Onseason on = new Onseason(cost);
		System.out.println("Cost after discount during On Season: "+on.discount());
		
		Offseason off = new Offseason(cost);
		System.out.println("Cost after discount during Off Season: "+off.discount());

	}

}
