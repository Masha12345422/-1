package lab4;

import java.util.Scanner;

public class rifles extends weapons implements WeaponInfo {
	private double calibr;
	private String model;
	private int range;
	public rifles(){};
	public rifles(String place, int date) {
		super(place, date);
		this.calibr = 300;
		this.model = "M4A1";
		this.range = 700;
	}
	public rifles(String place, int date, double calibr, String model, int range) {
		super(place, date);
		this.calibr = calibr;
		this.model = model;
		this.range = range;
	}
	public double getCalibr() {
		return calibr;
	}
	public void setCalibr(double calibr) {
		this.calibr = calibr;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public void CodeOfRifle()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter code of rifle (1-3): ");
		int N = sc.nextInt(); 
		if (N == 1) {
			System.out.println(N + " - M4A1");
			System.out.println("Country - USA");
			System.out.println("1994");
			System.out.println("Caliber - 5.56");
		}
		if (N == 2) {
			System.out.println(N + " - AK-47");
			System.out.println("Country - USSR");
			System.out.println("1947");
			System.out.println("Caliber - 7.62");
		}
		if (N == 3) {
			System.out.println(N + " - Steyr AUG");
			System.out.println("Country - Australia");
			System.out.println("1977");
			System.out.println("Caliber - 5.56");
		}
	}
}
