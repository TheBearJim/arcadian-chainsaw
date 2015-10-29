package builder;

import builder.Car.CarBuilder;

public class BuildIt {
	
	
	public static void main(String[] args){
		
		Car Mercedes = new CarBuilder(Brand.MERCERDES)
					.ModelType(Model.SCLASS)
					.Colour(Colour.BLACK)
					.Seats(Seats.LEATHER)
					.build();
					System.out.println(Mercedes);
	}

}
