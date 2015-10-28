package state;

public class OrderMade implements State {
	
	private State state ;
	private Order order;
	
	public OrderMade(Order order){
		this.order = order ;
	}

	@Override
	public void onEnterState() {
		System.out.println(String.format("Order made payment pending", order));
		
	}

	@Override
	public void observe() {
		System.out.println(String.format("order has been made", order));

	}

}
