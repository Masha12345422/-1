package Lab7;
import java.util.Scanner;

public class Electric {
		
		private String[] ReceiptCode;
		
		public Electric()
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the sum of added electricity receipts: \n");	
			receipts(in.nextLine());
		}
		
		public void receipts(String elect)
		{
			ReceiptCode = elect.split("\\s");
		}
		public String GetElecReceipt()
		{
			String name = "";
			for(int i = 0; i < ReceiptCode.length; i++) { 
		         name+=ReceiptCode[i]+" ";
		      }
			return name; 
		}
}
