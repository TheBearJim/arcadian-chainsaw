package state;

/**
 * @uml.dependency   supplier="state.Order"
 */
public class PaymentAccepted implements State {
	
	private Order order ;
	
	 public PaymentAccepted(Order order) {
		 this.order = order ;
	}

	@Override
	public void onEnterState() {
		System.out.println(String.format("payment is being accepted", order));
		
	}

	@Override
	public void observe() {
		System.out.println(String.format("payment has been accepted", order));
	}

}
