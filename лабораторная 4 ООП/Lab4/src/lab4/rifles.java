package lab4;

public class rifles extends weapons {
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
}
