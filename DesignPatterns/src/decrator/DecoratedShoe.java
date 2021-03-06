package decrator;

/**
 * @uml.dependency   supplier="decrator.DecorateItem"
 */
public class DecoratedShoe implements DecorateItem {
	
	/**
	 * @uml.property  name="decorated"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private DecorateItem decorated; 
	
	public DecoratedShoe(DecorateItem decorated) {
		this.decorated = decorated;
		
	}
	
	@Override
	public void getColour() {
		System.out.println("Decorated Red");
		decorated.getColour();
	}


	@Override
	public void getLaceColour() {
		System.out.println("Decorated Black");
		decorated.getColour();
	}

	@Override
	public void getSoleColour() {
		System.out.println("Decorated Grey");
		decorated.getSoleColour();
	}

}
