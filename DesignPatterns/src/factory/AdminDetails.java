package factory;

public class AdminDetails implements User {
	
	private UserType userType;
	
	public AdminDetails(UserType userType){
		this.userType = userType;
	}
	
	@Override
	public String toString(){
		return "Admin " + userType;
	}


	

}
