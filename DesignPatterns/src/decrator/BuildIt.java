package decrator;

public class BuildIt {
	
	public static void main(String[] args){
		
		//plain
		DecorateItem plain = new PlainShoe();
		plain.getColour();
		plain.getPrice();
		plain.getSoleColour();
		plain.getLaceColour();
		
		//decorated
		DecorateItem decorated = new DecoratedShoe(plain);
		decorated.getColour();
		decorated.getPrice();
		decorated.getLaceColour();
		decorated.getSoleColour();
		
	}

}
