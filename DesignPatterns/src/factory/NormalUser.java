package factory;

/**
 * @uml.dependency   supplier="factory.NormalUserDetails"
 */
public class NormalUser implements UserFactory {

	
	public User makeUser(UserType userType) {
		return new NormalUserDetails(userType);

	}
	

}
