package lab4;

public class sniperRifles extends rifles {
	private int opticalRange;
	public sniperRifles (String place, int date, double calibr, String model, int range) {
		super(place, date, calibr, model, range);
		this.opticalRange = 1300;
	}
	public sniperRifles (String place, int date, double calibr, String model, int range, int opticalRange) {
		super(place, date, calibr, model, range);
		this.opticalRange = opticalRange;
	}
	public int getOptRange() {
		return opticalRange;
	}
	public void setOptRange(int opticalRange) {
		this.opticalRange = opticalRange;
	}
}