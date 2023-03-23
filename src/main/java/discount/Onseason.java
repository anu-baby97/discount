package discount;

public class Onseason {
	
	private double cost;
	
	public Onseason(double cost) {
		
		this.cost=cost;
	
	}
	
	public double discount() {
		
		double onSeasonCost= cost - (cost*0.4);
		return onSeasonCost;
		
	}
}
