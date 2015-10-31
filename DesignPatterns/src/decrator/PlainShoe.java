package decrator;

public class PlainShoe implements DecorateItem {

	@Override
	public void getColour() {
		System.out.println("Plain shoe colour");
	}



	@Override
	public void getLaceColour() {
		System.out.println("plain colour");
	}

	@Override
	public void getSoleColour() {
		System.out.println("plain colour");
		
	}

}
