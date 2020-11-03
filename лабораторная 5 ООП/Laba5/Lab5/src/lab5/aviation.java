package lab4;

public class aviation extends weapons {
	private int calibr;
	private int speed;
	private boolean stels;
	public aviation(String place, int date) {
		super(place, date);
		this.calibr = 250;
		this.speed = 270;
		this.stels = true;
	}
	public aviation(String place, int date, int calibr, int speed, boolean stels) {
		super(place, date);
		this.calibr = calibr;
		this.speed = speed;
		this.stels = true;
	}
	public int getCalibr() {
		return calibr;
	}
	public void setCalibr(int calibr) {
		this.calibr = calibr;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStels() {
		return stels;
	}
	public void setStels(boolean stels) {
		this.stels = stels;
	}
}
