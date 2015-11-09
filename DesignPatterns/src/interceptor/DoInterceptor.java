package interceptor;

public class DoInterceptor {
	
	public static void main(String[] args){
		Dispatcher x = new Dispatcher(new IntercepterImplemtation()); 
		x.intercept();
			
		}
	}
	
	
	
	
	


