package builder;

public enum Brand {

	MERCERDES, BMW, VOLVO, VW;
	
	@Override
	public String toString(){
		return name().toLowerCase();
	}
}
