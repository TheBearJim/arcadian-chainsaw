package state;

public class OrderShipped implements State {
	
	private Order order;
	
	 public OrderShipped(Order order) {
		 this.order = order ;
	}

	@Override
	public void onEnterState() {
		System.out.println(String.format("order being shipped", order));
	}

	@Override
	public void observe() {
		System.out.println(String.format("order has been shipped", order));
		
	}

}
