package builder;


public enum Model {
	
	SCLASS, FIVESERIES, XC, GOLF;
	
	@Override
	public String toString(){
		return name().toLowerCase();
	}

}
