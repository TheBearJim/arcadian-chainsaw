package state;

/**
 * @uml.dependency   supplier="state.Order"
 */
public class PaymentNotAccepted implements State {

	private Order order ;
	
	public PaymentNotAccepted(Order order){
		this.order = order;
	}
	
	
	@Override
	public void onEnterState() {
		System.out.println(String.format("order has not been accepted", order));

	}

	@Override
	public void observe() {
		System.out.println(String.format("payment not accepted please try agagin", order));
		
	}

}
