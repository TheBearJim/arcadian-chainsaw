package factory;

public class NormalUserDetails implements User {
	
	private UserType userType;

	public NormalUserDetails(UserType userType){
		this.userType = userType;
	}
	
	@Override
	public String toString(){
		return "Normal User " + userType;
	}

}
