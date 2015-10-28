package factory;

public class NormalUserDetails implements User {
	
	/**
	 * @uml.property  name="userType"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private UserType userType;

	public NormalUserDetails(UserType userType){
		this.userType = userType;
	}
	
	@Override
	public String toString(){
		return "Normal User " + userType;
	}

}
