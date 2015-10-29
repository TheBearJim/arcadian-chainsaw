package builder;

public enum Seats {
	
	LEATHER, PLUSH, HEATED, REGULAR;
	
	public String toString(){
		return name().toLowerCase();
	}

}
