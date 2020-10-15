
public class Program {
	
	public static void main(String[] args)
	{
		people people1 = new people("Vasya","Proskov",5.6);
		people1.GetInfoOfPeople();
		Subject subject1 = new Subject ("math");
		subject1.GetSubject();
		Teacher teacher1 = new Teacher("Dmitriy","Alekseevich", "PE");
		teacher1.GetInfoOfTeacher();
		Teacher teacher2 = new Teacher("Natalia", "Vladiirovna","Math");
		teacher2.GetInfoOfTeacher();
	}

}
