package factory;

public class BuildItFactory {
	
	public static void main(String[] args){
		UserFactory userfactory; 
		User usertype;
		
		
		userfactory = new Admin();
		usertype = userfactory.makeUser(UserType.ADMIN);
		System.out.println(usertype);
	}

}
