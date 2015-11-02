package framework;

import java.util.Scanner;

import factory.*;
import framework.ThreadExample.RunThisTing;
import builder.*;
import state.*;
import stratgey.*;
import decrator.*;

public class Main {

	public static void main(String[] args) {
		
		StartFramework(args);
//		new ThreadExample();
//		RunThisTing.main(args);
	

	}

	public static void StartFramework(String[] args) {
		Scanner s = new Scanner(System.in);
		int option;
		System.out
				.println("[1]Factory a user [2]Build a car [3]Check state [4]Choose strat [5]Decorate a shoe ");
		System.out.println();
		option = s.nextInt();

		if (option == 1) {
			new BuildItFactory();
			BuildItFactory.main(args);
			StartFramework(args);

		} else {
			if (option == 2) {
				new ThreadExample();
				RunThisTing.main(args);
				StartFramework(args);

			} else {
				if (option == 3) {
					new BuildItState();
					BuildItState.main(args);
					StartFramework(args);

				} else {
					if (option == 4) {
						new BuiltItStrat();
						BuiltItStrat.main(args);
						StartFramework(args);

					} else {
						if (option == 5) {
							new BuildItDecrator();
							BuildItDecrator.main(args);
							StartFramework(args);

						}
					
					}
				}

			}
		}
	}

	}

