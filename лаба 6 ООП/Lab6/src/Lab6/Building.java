package Lab6;

import java.util.Scanner;

public class Building {
		public Building(){}
		
		public <Home> void print(Home[] buildings){
        for(Home building: buildings){
            System.out.println(building);
        }
    }
	public void Building() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter name of the street: ");
		String N = sc.nextLine(); 
		System.out.printf("In the street %s 5 buildings located", N);
	}

}
