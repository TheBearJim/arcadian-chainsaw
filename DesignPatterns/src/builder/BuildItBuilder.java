package builder;

import java.util.Scanner;

import builder.Car.CarBuilder;

public class BuildItBuilder {
	
	public static void BuildIt(){
		
	Scanner s = new Scanner(System.in);
	int option;
	System.out.println("What would you like to build[1]merc[2]bmw");
	System.out.println();
	option = s.nextInt();
	if(option == 1){	
	Car Mercedes = new CarBuilder(Brand.MERCERDES)
	.ModelType(Model.SCLASS)
	.Colour(Colour.BLACK)
	.Seats(Seats.LEATHER)
	.build();
	System.out.println(Mercedes);
	
	}else {
		if(option == 2){
			Car BMW = new CarBuilder(Brand.BMW)
			.ModelType(Model.FIVESERIES)
			.Colour(Colour.BLUE)
			.Seats(Seats.PLUSH)
			.build();
			System.out.println(BMW);
			
		}
	}
	}
}

	
	
//	public void buildCar(){
//		Scanner s = new Scanner(System.in);
//		String userBrand, userModel, userColour, userSeats;
//		System.out.print("Enter brand(Mercedes, BMW, volvo, VW");
//		System.out.println();
//		userBrand = s.nextLine();
//		System.out.print("Enter Model(sclass, five xc, volvo, golf");
//		System.out.println();
//		userModel = s.nextLine();
//		System.out.print("Enter Colour(red, blue, black, green");
//		System.out.println();
//		userColour = s.nextLine();
//		System.out.print("Enter Seats(leather, plush, heated, regular");
//		System.out.println();
//		userSeats = s.nextLine();
		
//		Car userCar = new CarBuilder(Brand.valueOf(userBrand)
//									.Model(Model.valueOf(userModel))
//									.Colour(Colour.valueOf(userColour))
//									.Seats(Seats.valueOf(userSeats))
//									.build();
//								System.out.println(userCar);
		
					
	


