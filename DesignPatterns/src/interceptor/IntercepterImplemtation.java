package interceptor;

public class IntercepterImplemtation extends InterceptorJim {

	@Override
	protected String InterceptionPoint() {
		return "   where the interception is taking place";
	}

	@Override
	protected void interceptThePoint(String point) {
		System.out.println("Intercepting" + point);
	}

}
