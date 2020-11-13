package Lab6;

public class Program {
	
	 public static void main(String[] args) {
       
		 	Generic<String> property1 = new Generic<String>("Scyscraper", "Morozova");
		 	property1.getInfo();
		 	Generic<String> property2 = new Generic<String>("Shop", "Lenina");
		 	property2.getInfo();
		 	Generic<String> property3 = new Generic<String>("House", "Lermontova");
		 	property3.getInfo();
		 	Building building = new Building();
		 	building.Building();
	  }
}
