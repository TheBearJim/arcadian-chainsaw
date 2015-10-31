package framework;

import java.util.Scanner;

import factory.*;
import builder.*;
import state.*;
import stratgey.*;
import decrator.*;



public class Main {
	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int option;
		System.out.println("[1] Factory a user [2]Build a car [3] Check state [4] choose strat [5] decorate a shoe ");
		System.out.println();
		option = s.nextInt();
		if(option == 1){	
		new BuildItFactory();
		BuildItFactory.main(args);
		
		}else {
			if(option == 2){
			new BuildItBuilder();
			BuildItBuilder.main(args);
			}else {
				if(option == 3){
					new BuildItState();
					BuildItState.main(args);
				}
				else {
					if(option == 4){
						new BuiltItStrat();
						BuiltItStrat.main(args);
					}
					else {
						if(option == 5){
							new BuildItDecrator();
							BuildItDecrator.main(args);
					}
						
					}
				}
				
				
}
		}
	}
}
