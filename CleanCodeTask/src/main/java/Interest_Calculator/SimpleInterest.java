package Interest_Calculator;

public class SimpleInterest extends InterestCalculator {

	public void SimpleInterest() {
		
	}
	public SimpleInterest(Double principal ,Double rateofInterest, Double timeperiod) {
		
		this.principal=principal;
		this.rateofInterest = rateofInterest;
		this.timeperiod= timeperiod;
	
	}
	
	public Double getSimpleInterest() {
		
		return ((principal * timeperiod * rateofInterest)/100);
		
	}
}
