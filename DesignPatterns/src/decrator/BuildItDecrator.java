package decrator;
import framework.*;

public class BuildItDecrator {
	
	public static void main(String[] args){
		
		//plain
		System.out.println("Plain Shoe");
		DecorateItem plain = new PlainShoe();
		plain.getColour();
		plain.getSoleColour();
		plain.getLaceColour();
		
		//decorated
		System.out.println("\nDecorated shoe");
		DecorateItem decorated = new DecoratedShoe(plain);
		decorated.getColour();
		decorated.getLaceColour();
		decorated.getSoleColour();
		
		
		
	}

}
