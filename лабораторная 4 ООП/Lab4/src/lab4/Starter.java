package lab4;

public class Starter {
	public static void main(String[] args) {
		System.out.println("Tanks: ");
		
		tanks tanks = new tanks("USSR", 1946, 60, 300);
		System.out.println("Where the tank was produced? " + tanks.getPlace());
		System.out.println("When the tank was produced? " + tanks.getDate());
		System.out.println("What is the speed of the tank? " + tanks.getSpeed());
		System.out.println("What is the caliber of the tank? " + tanks.getCalibr());
		
		System.out.println("Aviation: ");
		
		aviation aviation = new aviation("USSR", 1970, 250, 270, true);
		System.out.println("Where the aviation was produced? " + aviation.getPlace());
		System.out.println("When the aviation was produced? " + aviation.getDate());
		System.out.println("What is the speed of the aviation? " + aviation.getSpeed());
		System.out.println("What is the caliber of the aviation? " + aviation.getCalibr());
		System.out.println("Is this aviation stels? " + aviation.isStels());
		
		System.out.println("Rifles: ");
		
		rifles rifles = new rifles("USA", 1994, 5.56, "M4A1", 600);
		System.out.println("Where the rifle was produced? " + rifles.getPlace());
		System.out.println("When the rifle was produced? " + rifles.getDate());
		System.out.println("What is the caliber of the rifle? " + rifles.getCalibr());
		System.out.println("What is the model of the rifle? " + rifles.getModel());
		System.out.println("What is the range of the rifle? " + rifles.getRange());
		
		System.out.println("Sniper rifles: ");
		
		sniperRifles sniperRifles = new sniperRifles("USSR", 1963, 7.62, "DSR", 2000, 1300);
		System.out.println("Where the sniper rifle was produced? " + sniperRifles.getPlace());
		System.out.println("When the sniper rifle was produced? " + sniperRifles.getDate());
		System.out.println("What is the caliber of the sniper rifle? " + sniperRifles.getCalibr());
		System.out.println("What is the model of the sniper rifle? " + sniperRifles.getModel());
		System.out.println("What is the range of the sniper rifle? " + sniperRifles.getRange());
		System.out.println("What is the optical range of the sniper rifle? " + sniperRifles.getOptRange());
	} 
}