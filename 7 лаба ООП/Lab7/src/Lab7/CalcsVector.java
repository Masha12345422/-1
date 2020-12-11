package Lab7;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CalcsVector {
	
	public Vector<String>  Add(int numbers)
	{
		Vector<String>  electric = new Vector<String> ();
		for(int i =0; i<numbers;i++)
		{
			Electric elec = new Electric();
			electric.add(elec.GetElecReceipt());
		}
		return electric; 
	}
	public void removeVector (Vector<String> vector)
	{
		System.out.printf("Which of the %s receipts you want to remove? \n",vector.size());
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String rem_ele = vector.remove(n-1);
	}
	public void GetVector (Vector<String> calcs)
	{
		Enumeration<String> enm = calcs.elements();
		int i=1;
	    while(enm.hasMoreElements()){
	      System.out.printf("%s receipt sum: \n",i);
	      System.out.println(enm.nextElement());
	      i++;
	    }
	}
	    
	    public void Search (Vector<String> calcs)
		{
	    	Scanner in = new Scanner(System.in);
		      System.out.printf("Which receipt do you want to find?\n");
		      int n = in.nextInt();
		      System.out.println(calcs.get(n-1));
		    }
}
