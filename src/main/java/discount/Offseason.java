package discount;

public class Offseason {

	private double cost;

	
	public Offseason(double cost) {
		
		this.cost=cost;
	
	}
	
	public double discount() {
		
		double offSeasonCost= cost - (cost*0.15);
		return offSeasonCost;
		
	}

}
