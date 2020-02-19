package Interest_Calculator;

public class CompoundInterest extends InterestCalculator {
	
	public CompoundInterest() {
		
	}
	public CompoundInterest(Double principal,Double rateofInterest , Double timeperiod) {
		
		this.principal=principal;
		this.rateofInterest=rateofInterest;
		this.timeperiod=timeperiod;
		
	}
	public Double getCompoundInterest() {
		
		return (principal * Math.pow(1.0 + rateofInterest / 100.0, timeperiod) - principal);
		
	}

}
