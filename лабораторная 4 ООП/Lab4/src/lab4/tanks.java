package lab4;

public class tanks extends weapons {
	private int calibr;
	private int speed;
	public tanks(String place, int date) {
		super(place, date);
		this.calibr = 300;
		this.speed = 60;
	}
	public tanks(String place, int date, int speed, int calibr) {
		super(place, date);
		this.calibr = calibr;
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getCalibr() {
		return calibr;
	}
	public void setCalibr(int calibr) {
		this.calibr = calibr;
	}
}
