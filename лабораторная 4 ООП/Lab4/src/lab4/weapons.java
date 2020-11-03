package lab4;

public class weapons {
	private String country;
	private int year;
	public weapons(){};
	public weapons(String place, int date) {
		this.country = place;
		this.year = date;
	}
	public String getPlace() {
		return country;
	}
	public void setPlace(String country) {
		this.country = country;
	}
	public int getDate() {
		return year;
	}
	public void setDate(int year) {
		this.year = year;
	}
}
