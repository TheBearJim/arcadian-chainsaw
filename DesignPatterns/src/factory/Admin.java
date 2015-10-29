package factory;

/**
 * @uml.dependency   supplier="factory.AdminDetails"
 */
public class Admin implements UserFactory  {
	
	
	public User makeUser(UserType userType) {
		return new AdminDetails(userType);
	}

}
