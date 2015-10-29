package state;


/**
 * @uml.dependency   supplier="state.State"
 */
public class Order {
	
	private State state;
	
	public Order(){
		state = new PaymentAccepted(this);
	}
	
	public void stateOfOrder(){
		if(state.getClass().equals(PaymentAccepted.class)){
			changeStateTo(new OrderShipped(this));
		} else {
			changeStateTo(new PaymentNotAccepted(this));
		}
	}
	
	private void changeStateTo(State newState){
		this.state = newState;
		this.state.onEnterState();
	}
	
	@Override
	public String toString(){
		return "Order";
	}
	
	public void observe(){
		this.state.observe();
	}

}
