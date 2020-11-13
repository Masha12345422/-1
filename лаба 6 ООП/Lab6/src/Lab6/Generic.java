package Lab6;

public class Generic<Home>{
    
    private Home address;
    private String type;
     
    Generic(String type, Home address){
        this.address = address;
        this.type = type;
    }
    
    public void getInfo() {
    	System.out.printf("Building type is %s. Building located in %s\n",type, address);
    	}
}
