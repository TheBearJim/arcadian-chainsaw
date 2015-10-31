package builder;


public enum Model {
	
	SCLASS ("sclass"), FIVESERIES("fiveseries"), XC("xc"), GOLF("golf");
	
	private String value;
	private Model(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	@Override
	public String toString(){
		return name().toLowerCase();
	}

}
