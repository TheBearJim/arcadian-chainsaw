package factory;

public class AdminDetails implements User {
	
	/**
	 * @uml.property  name="userType"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private UserType userType;
	
	public AdminDetails(UserType userType){
		this.userType = userType;
	}
	
	@Override
	public String toString(){
		return "Admin " + userType;
	}


	

}
