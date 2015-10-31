package builder;

public class Car {
	
	private final Brand brand;
	private final Model model;
	private final Colour colour;
	private final Seats seats;
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
	
	public Seats getSeats(){
		return seats ;
	}
	
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("Car type:	");
		s.append(brand);
		s.append("	Model:	");
		s.append(model);
		s.append("	Colour:	");
		s.append(colour);
		s.append("	Seats:	");
		s.append(seats);
		s.append(".");
		return s.toString();
	}
	
	private Car(CarBuilder builder){
		this.brand =  builder.brand;
		this.colour = builder.colour;
		this.model = builder.model;
		this.seats = builder.seats;
	}
	

	public static class CarBuilder {
		
		private  Brand brand;
		private  Model model;
		private  Colour colour;
		private  Seats seats;
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
		
		public CarBuilder Seats(Seats seats){
			if(seats == null){
				throw new IllegalArgumentException("rims cannot be null");
			}
			this.seats = seats;
			return this ;
		}
		public Car build(){
			return new Car(this);
		}

	}

	
	
	
}
