
public class people {
	
	private String name;
	private String LastName;
	private double rating;
	
	public people (String name, String LastName, double rating)
	{
		this.name = name;
		this.LastName = LastName;
		this.rating = rating;
	}
	
	public void GetInfoOfPeople()
	{
		System.out.printf("Pupil %s %s came to the lesson and his rating(%s) increased by 1\n", name,LastName,rating);

}
}
