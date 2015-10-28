package decrator;

public class BuildIt {
	
	public static void main(String[] args){
		
		//plain
		DecorateItem plain = new PlainItem();
		plain.getColour();
		plain.getPrice();
		plain.getSoleColour();
		plain.getLaceColour();
		
		//decorated
		DecorateItem decorated = new DecoratedItem(plain);
		decorated.getColour();
		decorated.getPrice();
		decorated.getLaceColour();
		decorated.getSoleColour();
		
	}

}
