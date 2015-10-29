package builder;

public enum Colour {
	
	RED, BLUE, BLACK, GREEN ;
	
	@Override
	public String toString(){
		return name().toLowerCase();
	}

}
