package Lab7;

import java.util.*;

public class Program {
	
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of electricity receipts: \n");
		CalcsVector receipt = new CalcsVector();
		Vector<String> electric= new Vector<String>();
		electric = receipt.Add(in.nextInt());
	    receipt.GetVector(electric);
	    receipt.removeVector(electric);
	    receipt.GetVector(electric);
	    receipt.Search(electric);
	}

}
