package factory;

public enum UserType {
	
	PLATINUM_ACCESS("platinum access"),GOLD_ACCESS("gold access"),SILVER_ACCESS("silver acces"), ADMIN("admin");
	
	private String title;
	
	UserType(String title) {
		this.title = title ;
	}
	
	@Override
	public String toString(){
		return title;
	}
}
