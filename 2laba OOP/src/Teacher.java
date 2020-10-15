
public class Teacher {
	
	private String name;
	private String LastName;
	private String nameSubjects;
	
	public Teacher (String name, String LastName, String nameSubjects)
	{
		this.name = name;
		this.LastName = LastName;
		this.nameSubjects = nameSubjects;
	}
	public void GetInfoOfTeacher()
	{
		System.out.printf("Teacher %s %s starts a %s lesson\n", name,LastName,nameSubjects);

}

}
