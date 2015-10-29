package builder;

public class Car {
	
	private final Brand brand;
	private final Model model;
	private final Colour colour;
	private final Rims rims;
	//room to add more
	
	public Brand getBrand(){
		return brand;
	}
	
	public Model getModel(){
		return model;
	}
	
	public Colour getColour(){
		return colour ;
	}
	
	public Rims getRims(){
		return rims ;
	}
	
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("Car type:");
		s.append(brand);
		s.append("Model Number:");
		s.append(model);
		s.append("Colour:");
		s.append(colour);
		s.append("Rims: ");
		s.append(rims);
		s.append(".");
		return s.toString();
	}
	
	private Car(CarBuilder builder){
		this.brand =  builder.brand;
		this.colour = builder.colour;
		this.model = builder.model;
		this.rims = builder.rims;
	}
	

	public static class CarBuilder {
		
		private  Brand brand;
		private  Model model;
		private  Colour colour;
		private  Rims rims;
		//room to add more
		
		
		public CarBuilder(Brand brand){
			if(brand == null){
				throw new IllegalArgumentException("Brand cannot be null");
			}
			this.brand = brand ;
		}
		
		public CarBuilder ModelType(Model model){
			if(model == null){
				throw new IllegalArgumentException("model cannot be null");
			}
			this.model = model;
			return this ;
		}
		
		public CarBuilder Colour(Colour colour){
			if(colour == null){
				throw new IllegalArgumentException("colour cannot be null");
			}
			this.colour = colour;
			return this;
		}
		
		public CarBuilder Rims(Rims rims){
			if(rims == null){
				throw new IllegalArgumentException("rims cannot be null");
			}
			this.rims = rims;
			return this ;
		}
		public Car build(){
			return new Car(this);
		}

	}

	
	
	
}
