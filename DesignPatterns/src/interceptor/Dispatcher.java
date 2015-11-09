package interceptor;

public  class Dispatcher  {

	private InterceptorJim interceptorA;//can be many 
	
	public Dispatcher(InterceptorJim interceptorA){
		this.interceptorA = interceptorA;
	}
	
	public void intercept(){
		interceptorA.intercept();
	}

	/**
	 * @uml.property  name="interceptorJim"
	 * @uml.associationEnd  inverse="dispatcher:interceptor.InterceptorJim"
	 */
	private InterceptorJim interceptorJim;

	/**
	 * Getter of the property <tt>interceptorJim</tt>
	 * @return  Returns the interceptorJim.
	 * @uml.property  name="interceptorJim"
	 */
	public InterceptorJim getInterceptorJim() {
		return interceptorJim;
	}

	/**
	 * Setter of the property <tt>interceptorJim</tt>
	 * @param interceptorJim  The interceptorJim to set.
	 * @uml.property  name="interceptorJim"
	 */
	public void setInterceptorJim(InterceptorJim interceptorJim) {
		this.interceptorJim = interceptorJim;
	}
	

}
