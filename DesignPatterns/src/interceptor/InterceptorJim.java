package interceptor;



public abstract class InterceptorJim {

	protected abstract String InterceptionPoint();
	
	protected abstract void interceptThePoint(String point);
	
	public void intercept(){
		String point = InterceptionPoint();
		System.out.println("add interceptor methods "+ point);
		interceptThePoint(point);
	}

	/**
	 * @uml.property  name="dispatcher"
	 * @uml.associationEnd  inverse="interceptorJim:interceptor.Dispatcher"
	 */
	private Dispatcher dispatcher;

	/**
	 * Getter of the property <tt>dispatcher</tt>
	 * @return  Returns the dispatcher.
	 * @uml.property  name="dispatcher"
	 */
	public Dispatcher getDispatcher() {
		return dispatcher;
	}

	/**
	 * Setter of the property <tt>dispatcher</tt>
	 * @param dispatcher  The dispatcher to set.
	 * @uml.property  name="dispatcher"
	 */
	public void setDispatcher(Dispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}


}
