package state;

public class BuildItState {
	
	public static void main(String[] args){
		
		Order order = new Order();
		order.observe();
		order.stateOfOrder();
	}

}
