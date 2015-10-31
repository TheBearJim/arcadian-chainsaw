package stratgey;

public class BuiltItStrat {
	
	public static void main(String[] args){
		Payment pay = new Payment(new CreditCard());
		pay.MakePayment();
	}

}
