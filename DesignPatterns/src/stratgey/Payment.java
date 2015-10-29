package stratgey;

public class Payment {
	
	private Stratgey strat;
	
	public Payment(Stratgey strat){
		this.strat = strat;
	}
	public void ChangePayment(Stratgey strat){
		this.strat = strat;
	}
	public void MakePayment(){
		strat.execute();
	}

}
